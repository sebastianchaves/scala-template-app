import sbt.Resolver

name := "scala-template-app"
version := "0.1"
scalaVersion := "2.13.0"

lazy val `scala-template-app` = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies += guice
libraryDependencies ++= Dependencies.scalaTemplateDependencies

resolvers += Resolver.sonatypeRepo("snapshots")
resolvers += Resolver.sonatypeRepo("releases")
resolvers += "Sonatype-public" at "http://oss.sonatype.org/content/groups/public/"
