package com.schaves.scala.template.products

import play.api.libs.json.{Json, OFormat, OWrites, Reads}

case class Product(id: String, name: String, description: String)

object Product {
  //implicit val reads: Reads[Product] = Json.reads[Product]
  implicit val writes: OWrites[Product] = Json.writes[Product]
  //implicit val format: OFormat[Product] = Json.format[Product]
}
