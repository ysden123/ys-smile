/*
 * Copyright (c) 2023. StulSoft
 */

package com.stulsoft.smile.visualization

import smile.data.*
import smile.plot.swing.plot

import java.awt.Color

object DataVisualizationEx02:
  def main(args: Array[String]): Unit =
    println("==>main")
    val data: Array[Array[Double]] = Array(
      Array(1.0, 2.0),
      Array(2.0, 30.0),
      Array(3.0, 14.0),
      Array(4.0, 5.0),
      Array(5.0, 3.0))

    val df: DataFrame = DataFrame.of(data, "Первый", "Второй")

    val canvas = plot(df, "Первый", "Второй", '*', Color.RED)
    canvas.window()
