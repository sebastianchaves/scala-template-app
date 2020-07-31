package com.schaves.scala.template.products

import com.schaves.scala.template.utils.Logging
import javax.inject.Inject

class ProductsService @Inject()(repository: ProductsRepository) extends Logging {

  def getAll: List[Product] = repository.findAll

}
