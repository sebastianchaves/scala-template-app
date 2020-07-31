package com.schaves.scala.template.utils

import play.api.Logger

trait Logging {

  lazy val LOGGER: Logger = Logger(this.getClass)

  def trace(message: => String): Unit = LOGGER.trace(message)

  def debug(message: => String): Unit = LOGGER.debug(message)

  def info(message: => String): Unit = LOGGER.info(message)

  def warn(message: => String): Unit = LOGGER.warn(message)

  def error(message: => String): Unit = LOGGER.error(message)

  def error(message: => String, exception: Throwable): Unit = LOGGER.error(message, exception)

}
