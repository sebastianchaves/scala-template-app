package com.schaves.scala.template

import javax.inject.Inject
import play.api.libs.json.{Json, OFormat}
import play.modules.reactivemongo.ReactiveMongoApi
import reactivemongo.api.bson.BSONDocument
import reactivemongo.api.bson.collection.BSONCollection
import reactivemongo.api.commands.WriteResult
import reactivemongo.api.{AsyncDriver, MongoConnection}

import scala.concurrent.{ExecutionContext, Future}

class ProductRepository @Inject()(implicit ec: ExecutionContext,
                                  reactiveMongoApi: ReactiveMongoApi) {

  private val driver = new AsyncDriver()
  private val connection: Future[MongoConnection] = driver.connect("localhost")
  private val collection: Future[BSONCollection] = connection.flatMap(_.database("test")).map(_.collection("products"))

  def insert: Future[WriteResult] = {
    val document = BSONDocument("id" -> "1", "name" -> "sale o no sale", "value" -> 1)
    collection.flatMap(_.insert.one(document))
  }

}

case class Product(_id: String,
                   name: String,
                   description: String)

object Product {
  implicit val format: OFormat[Product] = Json.format[Product]
}

case class RepositoryError(message: String, throwable: Throwable) extends RuntimeException(message, throwable)
