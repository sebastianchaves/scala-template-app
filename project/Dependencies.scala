import sbt._

object Dependencies {

  val scalaTestPlusPlay = "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.3" % Test

  val scalaTemplateDependencies: Seq[ModuleID] = Seq(scalaTestPlusPlay)

}
