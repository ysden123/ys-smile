/*
 * Copyright (c) 2023. StulSoft
 */

package com.stulsoft.smile.visualization

import smile.plot.*
import smile.data.*
import smile.plot.swing.ScatterPlot

object DataVisualizationEx01:
  def main(args: Array[String]): Unit =
    println("==>main")
/*
    // Create some sample data
    /*
        val data = DataFrame. //new DataFrameImpl("X", "Y")
        data.append(Array(1.0, 2.0))
        data.append(Array(2.0, 3.0))
        data.append(Array(3.0, 4.0))
        data.append(Array(4.0, 5.0))
        data.append(Array(5.0, 6.0))
    */

    val data: DataFrame = null
    // Create a scatter plot
    val canvas = ScatterPlot.plot("Simple Scatter Plot", data.toArray, '.')

    // Show the plot
    SwingNodeHelper.show(canvas)
*/
