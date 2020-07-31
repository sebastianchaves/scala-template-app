package com.schaves.scala.template.products

class ProductsRepository {

  private val products = List(Product("1", "mock name", "mock description"),
                              Product("2", "mock name", "mock description"),
                              Product("3", "mock name", "mock description"),
                              Product("4", "mock name", "mock description"))

  def findAll: List[Product] = products

  def findBy(id: String): Option[Product] = products.find(_.id == id)

  def insert(product: Product): Product = product

  def update() = ???

  def delete() = ???

}

case class RepositoryError(message: String, throwable: Throwable) extends RuntimeException(message, throwable)
