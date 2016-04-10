enablePlugins(ScalaJSPlugin)

name := "scala-page"

version := "1.0"

scalaVersion := "2.11.8"

// Adding new dependencies; the three %'s mean we are using scala.js dependencies instead of regular Scala deps.
libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.9.0"


libraryDependencies ++= {
  val akkaV = "2.3.9"
  val sprayV = "1.3.3"

  Seq(
    "io.spray"            %%  "spray-can"     % sprayV,
    "io.spray"            %%  "spray-routing" % sprayV,
    "io.spray"            %%  "spray-testkit" % sprayV  % "test",
    "com.typesafe.akka"   %%  "akka-actor"    % akkaV,
    "com.typesafe.akka"   %%  "akka-testkit"  % akkaV   % "test",
    "org.specs2"          %%  "specs2-core"   % "2.3.11" % "test"
  )
}

// Making sure we are not using the internal slow rhino compiler but nodejs instead which is much more performant
scalaJSUseRhino in Global := false

Revolver.settings