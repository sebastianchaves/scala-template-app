import sbt._

object Dependencies {

  val reactiveMongoPlay = "org.reactivemongo" %% "play2-reactivemongo" % "0.20.11-play27"

  val scalaTestPlusPlay = "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.3" % Test

  val testContainersScalaVersion = "0.38.1"
  val testContainersScala = "com.dimafeng" %% "testcontainers-scala-scalatest" % testContainersScalaVersion % Test
  val testContainersMongo = "com.dimafeng" %% "testcontainers-scala-mongodb" % testContainersScalaVersion % Test

  val scalaTemplateDependencies: Seq[ModuleID] = Seq(reactiveMongoPlay, scalaTestPlusPlay, testContainersScala, testContainersMongo)

}
