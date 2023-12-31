/*
 * Copyright (c) 2023. StulSoft
 */

package com.stulsoft.smile.visualization

import smile.data.*
import smile.plot.swing.{Canvas, ScatterPlot}

object DataVisualizationEx01:
  def main(args: Array[String]): Unit =
    println("==>main")
    val data: Array[Array[Double]] = Array(
      Array(1.0, 2.0),
      Array(2.0, 30.0),
      Array(3.0, 14.0),
      Array(4.0, 5.0),
      Array(5.0, 3.0))

    val df: DataFrame = DataFrame.of(data)

    val plotter: ScatterPlot = ScatterPlot.of (data)
    val canvas: Canvas = plotter.canvas()
    canvas.setAxisLabels("Первый", "Второй")
    canvas.window()
