package com.schaves.scala.template

import com.schaves.scala.template.products.ProductsRepository
import javax.inject.Inject
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents}

import scala.concurrent.ExecutionContext

class SimpleController @Inject()(implicit ec: ExecutionContext,
                                 cc: ControllerComponents,
                                 repository: ProductsRepository) extends AbstractController(cc) {

  def get: Action[AnyContent] = Action { implicit request =>
    Ok(s"Got request [$request]")
  }

  def getProduct(id: String): Action[AnyContent] = Action.async { implicit request =>
    //repository.find(id).map(product => Ok(Json.toJson(product)))
    ???
  }

  def create: Action[AnyContent] = Action.async { implicit request =>
    //repository.insert.map(result => Ok(Json.toJson(result)))
    ???
  }

  def getProducts: Action[AnyContent] = ???

}
