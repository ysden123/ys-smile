/*
 * Copyright (c) 2023. StulSoft
 */

package com.stulsoft.smile.data

import smile.data.DataFrame

object DataEx01:
  private def createDataFrame1(): Unit =
    val data = Array.ofDim[Double](2, 2)
    data(0)(0) = 1.0
    data(0)(1) = 2.0
    data(1)(0) = 2.0
    data(1)(1) = 4.0
    val df = DataFrame.of(data, "X", "Y")
    println(s"names: ${df.names().toSeq}")
  def main(args: Array[String]): Unit =
    println("==>main")
    createDataFrame1()
