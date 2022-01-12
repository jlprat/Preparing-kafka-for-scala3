val scala3Version = "3.0.2"
val scala31Version = "3.1.0"
val scala213Version = "2.13.6"

lazy val supportedScalaVersions = List(scala213Version, scala3Version, scala31Version)

lazy val root = project
  .in(file("."))
  .settings(
    name := "Preparing-Kafka-Scala3",
    version := "0.1.0",

    scalaVersion := scala3Version,
    crossScalaVersions := supportedScalaVersions

    libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.10" % "test"

  )
