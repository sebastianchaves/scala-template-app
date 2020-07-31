package com.schaves.scala.template.products

import javax.inject.Inject
import play.api.libs.json.{JsValue, Json}
import play.api.mvc._

class ProductsController @Inject()(service: ProductsService,
                                   cc: ControllerComponents) extends AbstractController(cc) {

  def getAll: Action[AnyContent] = Action { implicit request =>
    val product = Product("1", "algo", "algo mas")

    Ok(Json.toJson(product))
  }

  def getBy(id: String): Action[AnyContent] = Action { implicit request =>
    Ok(s"Requested something with id $id")
  }

  def create: Action[JsValue] = Action(parse.json) { implicit request: Request[JsValue] =>
//    Json.fromJson(request.body) match {
//      case JsSuccess(value, _) => Ok(Json.toJson(value))
//      case JsError(_) => InternalServerError("error")
//    }
    ???
  }

}
