/*
 * Copyright (c) 2023. StulSoft
 */

package com.stulsoft.smile.data

import smile.data.DataFrame

/**
 * Demonstrates manual creating DataFrame
 */
object DataEx01:
  private def createDataFrame1(): Unit =
    val data = Array(Array(1.0, 2.0), Array(2.0, 4.0))
    val df = DataFrame.of(data, "Русский Xxx", "Yyy")
    println(s"names: ${df.names().toSeq}")

  def main(args: Array[String]): Unit =
    println("==>main")
    createDataFrame1()
