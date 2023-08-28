/*
 * Copyright (c) 2023. StulSoft
 */

package com.stulsoft.smile.data

import smile.data.DataFrame
import smile._

/**
 * Demonstrates the writing and the reading of a DataFrame to and from the CSV file.
 */
object WriteReadEx01:

  private def buildDataFrame(): DataFrame =
    println("==>buildDataFrame")
    val data = Array(Array(1.0, 2.0), Array(2.0, 4.0))
    val df = DataFrame.of(data, "Axis X", "Axis Y")
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
      println(s"ncol = ${df.ncol()}, nrow = ${df.nrow()}")
      println(s"names: ${df.names().toList}")
      val value = df.get(0, "Axis Y")
      println(s"0,1 -> $value")
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
