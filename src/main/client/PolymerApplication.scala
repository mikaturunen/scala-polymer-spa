import scala.scalajs.js.JSApp
import org.scalajs.dom
import dom.document

object PolymerApplication extends JSApp {
  def main(): Unit = {
    appendPar(document.body, "Test")
  }

  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val node = document.createElement("p")
    val textNode = document.createTextNode(text)

    node.appendChild(textNode)
    targetNode.appendChild(node)
  }
}
