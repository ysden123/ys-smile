/*
 * Copyright (c) 2023. StulSoft
 */

package com.stulsoft.smile.data

import smile.data.DataFrame
import scala.jdk.CollectionConverters._

/**
 * Demonstrates manual creating DataFrame with the usage of a case class.
 */
object DataEx02:
  private def createDataFrame1(): Unit =
    try
      val myData = List(
        MyData1(1.0, 2.0, "Cat 1"),
        MyData1(2.0, 4.0, "Cat 2")
      )
      val df = DataFrame.of(myData.asJava, classOf[MyData1])
      println(df)
    catch
      case exception: Exception =>
        exception.printStackTrace()

  def main(args: Array[String]): Unit =
    println("==>main")
    createDataFrame1()
