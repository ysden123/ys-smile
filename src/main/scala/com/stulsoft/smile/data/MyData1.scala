/*
 * Copyright (c) 2023. StulSoft
 */

package com.stulsoft.smile.data

/**
 * The case class for tests.
 * @param a a double column
 * @param b a double column
 * @param cat a string column
 */
case class MyData1(a: Double, b: Double, cat:String):
  def getA:Double = a
  def getB:Double = b

  def getCat:String = cat
