/*
 * Copyright (c) 2023. StulSoft
 */

package com.stulsoft.smile.visualization

import smile.plot.swing.line

import java.awt.Color
import scala.math.*

object HeartDraw:
  def main(args: Array[String]): Unit =
    println("==>main")
    val heart = -314 to 314 map { i =>
      val t = i / 100.0
      val x = 16 * pow(sin(t), 3)
      val y = 13 * cos(t) - 5 * cos(2 * t) - 2 * cos(3 * t) - cos(4 * t)
      Array(x, y)
    }
    val canvas = line(heart.toArray, color = Color.RED)
    canvas.window()
