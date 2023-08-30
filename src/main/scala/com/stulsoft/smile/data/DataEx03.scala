/*
 * Copyright (c) 2023. StulSoft
 */

package com.stulsoft.smile.data

import smile.data.DataFrame
import scala.jdk.CollectionConverters._

/**
 * Manipulations with DataFrame
 */
object DataEx03:

  private def createDataFrame1(): DataFrame =
    val myData = List(
      MyData1(1.0, 2.0, "Cat 1"),
      MyData1(2.0, 4.0, "Cat 2"),
      MyData1(3.0, 1.0, "Cat 2"),
      MyData1(5.0, 6.0, "Cat 7")
    )
    DataFrame.of(myData.asJava, classOf[MyData1])

  private def playWithSelect(): Unit =
    println("==>playWithSelect")
    val df1 = createDataFrame1()
    println(df1.select("b"))

  def main(args: Array[String]): Unit =
    println("==>main")
    playWithSelect()
