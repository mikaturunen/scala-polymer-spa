package http

import scala.concurrent.duration._
import akka.pattern.ask
import akka.util.Timeout
import akka.actor._
import spray.can.Http
import spray.can.server.Stats
import spray.util._
import spray.http._
import HttpMethods._
import MediaTypes._
import spray.can.Http.RegisterChunkHandler
import spray.routing.HttpService

trait StaticService extends HttpService {
  val staticRoute = {
    path("/") {
      getFromResource("index.html")
    }

    path("/target/scala-page-fastops.js ") {
      getFromResource("scala-page-fastops.js")
    }
  }
}
class HttpServerRoutes extends Actor with ActorLogging {
  implicit val timeout: Timeout = 1.second

  def receive = {
    case _: Http.Connected => sender ! Http.Register(self)
  }
}
