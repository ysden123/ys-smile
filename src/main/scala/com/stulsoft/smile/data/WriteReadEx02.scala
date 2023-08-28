/*
 * Copyright (c) 2023. StulSoft
 */

package com.stulsoft.smile.data

import smile.*
import smile.data.DataFrame

import scala.jdk.CollectionConverters.*

/**
 * Demonstrates the writing and the reading of a DataFrame to and from the CSV file with the usage of the case class.
 */
object WriteReadEx02:

  private def buildDataFrame(): DataFrame =
    println("==>buildDataFrame")
    val myData = List(
      MyData1(1.0, 2.0, "Cat 1"),
      MyData1(2.0, 4.0, "Cat 2")
    )
    val df = DataFrame.of(myData.asJava, classOf[MyData1])
    df

  private def writeDataFrame(df:DataFrame, fn:String):Unit=
    println("==>writeDataFrame")
    try
      write.csv(df, fn, ",")
    catch
      case exception: Exception =>
        exception.printStackTrace()

  private def readDataFrame(fn:String):Unit=
    println("==>readDataFrame")
    try
      val df = read.csv(fn)
      println(df)
    catch
      case exception: Exception =>
        exception.printStackTrace()

  def main(args: Array[String]): Unit =
    println("==>main")
    val df = buildDataFrame()
    val temp = java.io.File.createTempFile("dataFrame", ".csv")
    val fn = temp.getAbsolutePath
    println(s"Filename: $fn")
    writeDataFrame(df, fn)
    readDataFrame(fn)
    temp.delete()
