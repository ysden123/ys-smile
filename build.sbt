ThisBuild / scalaVersion := "3.3.0"
ThisBuild / version := "0.0.1"
ThisBuild / organization := "com.stulsoft"
ThisBuild / organizationName := "stulsoft"

lazy val root = (project in file("."))
  .settings(
    name := "ys-smile",
    libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",
    libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.4.7",
    libraryDependencies += "com.github.haifengl" %% "smile-scala" % "3.0.2",

    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % Test
  )