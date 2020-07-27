package com.schaves.scala.template

import javax.inject.Inject
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents, Request}

class SimpleController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def get: Action[AnyContent] = Action { implicit request =>
    doSomething()
    Ok(s"Got request [$request]")
  }

  def post: Action[AnyContent] = Action { implicit request =>
    Ok("")
  }

  private def doSomething()(implicit request: Request[_]): String = {
    ""
  }

}
