package com.schaves.scala.template.utils

import javax.inject.Inject
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents}

class HealthCheckController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def healthCheck: Action[AnyContent] = Action(_ => Ok("I'm ok"))
}
