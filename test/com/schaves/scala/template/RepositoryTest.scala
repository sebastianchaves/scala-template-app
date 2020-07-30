package com.schaves.scala.template

import com.dimafeng.testcontainers.MongoDBContainer.{Def => MongoDBContainerDef}
import com.dimafeng.testcontainers.scalatest.TestContainerForAll
import org.scalatest.BeforeAndAfter
import org.scalatestplus.play.PlaySpec

class RepositoryTest extends PlaySpec with TestContainerForAll with BeforeAndAfter {

  override val containerDef: MongoDBContainerDef = MongoDBContainerDef()

  "" in {
    val container = containerDef.start()
  }

}
