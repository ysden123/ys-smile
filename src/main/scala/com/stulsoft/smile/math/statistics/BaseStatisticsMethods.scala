/*
 * Copyright (c) 2023. StulSoft
 */

package com.stulsoft.smile.math.statistics

import smile.math.MathEx.*

object BaseStatisticsMethods:
  private def mean01(x: Array[Double]): Double =
    println("==>mean01")
    mean(x)

  private def test1(): Unit =
    println("==>test1")
    val a = Array(1.0, 2.0, 3.0, 200.0, 300.0)
    val mean = mean01(a)
    println(s"Array: ${a.toSeq} -> mean=$mean")

  private def testMedian(): Unit =
    println("==>testMedian")
    val a = Array(1.0, 2.0, 3.0, 200.0, 300.0)
    val medianResult = median(a)
    println(s"Array: ${a.toSeq} -> median=$medianResult")

  def main(args: Array[String]): Unit =
    println("==>main")
    test1()
    testMedian()
