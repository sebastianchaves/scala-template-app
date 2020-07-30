package com.schaves.scala.template

import javax.inject.Inject
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents, Cookie, DiscardingCookie}

class ProductController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index: Action[AnyContent] = Action { implicit request =>
    Ok(s"Recieved request with cookies: ${request.cookies}")
      .as(JSON)
      .withCookies(Cookie("theme", "blue"))
      .discardingCookies(DiscardingCookie("Cookie_1"))
  }

  def getWithPathVariable(id: String): Action[AnyContent] = Action { implicit request =>
    Ok(s"Requested something with id $id")
  }

  def getWithQueryParam(name: String): Action[AnyContent] = Action { implicit request =>
    Ok(s"Requested something with query param name $name")
  }

}
