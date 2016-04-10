enablePlugins(ScalaJSPlugin)

name := "scala-page"

version := "1.0"

scalaVersion := "2.11.8"

// Making sure we are not using the internal slow rhino compiler but nodejs instead which is much more performant
scalaJSUseRhino in Global := false