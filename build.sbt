enablePlugins(ScalaJSPlugin)

name := "scala-page"

version := "1.0"

scalaVersion := "2.11.8"

// Adding new dependencies; the three %'s mean we are using scala.js dependencies instead of regular Scala deps.
libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.9.0"

// Making sure we are not using the internal slow rhino compiler but nodejs instead which is much more performant
scalaJSUseRhino in Global := false