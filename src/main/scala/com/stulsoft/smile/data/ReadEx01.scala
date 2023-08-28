/*
 * Copyright (c) 2023. StulSoft
 */

package com.stulsoft.smile.data

import smile._

/**
 * Demonstrates the reading of a DataFrame from the CSV file.
 */
object ReadEx01:
  def main(args: Array[String]): Unit =
    println("==>main")
    val fn = "data/combined.csv"
    try
      val df = read.csv(fn)
      println(df)
      println(s"ncol = ${df.ncol()}, nrow = ${df.nrow()}")
      println(s"names: ${df.names().toList}")
      val value = df.get(0, "Column 1")
      println(s"0,1 -> $value")
      println(df.summary())

      var cat = df.get(0, 2)
      println(s"0,Category -> $cat")
      cat = df.get(1, 2)
      println(s"1,Category -> $cat")
    catch
      case exception: Exception =>
        exception.printStackTrace()
