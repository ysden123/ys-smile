/*
 * Copyright (c) 2023. StulSoft
 */

package com.stulsoft.smile.nlp

import smile.nlp
import smile.nlp.*

object NlpEx01:
  private def sentencesEx01(): Unit =
    println("==>sentencesEx01")
    val sentences = "Some sentence 1. Some sentence 2.Some sentence 3.".sentences
    println(s"sentences: ${sentences.toList}")

  private def wordSegmentationEx01(): Unit =
    println("==>wordSegmentationEx01")
    var sentence = "First sentence one."
    var words = sentence.words(" ")
    println(s"sentence: $sentence")
    println(s"words: ${words.toList}")

    sentence = "First, sentence - two."
    words = sentence.words(" ")
    println(s"sentence: $sentence")
    println(s"words: ${words.toList}")

    var sentences = "First, sentence - one.Second sentence - two.".sentences
    val stem = porter.stem("Democratization")
    println(s"stem: $stem")
    var text = "one two one three four three"
    var bagOfWords = text.bag(" ", Some(porter))
    println(s"text: $text")
    println(s"bagOfWords: $bagOfWords")

    text = "one two one three four three. Second sentence with one."
    bagOfWords = text.normalize.bag(" ", Some(porter))

    println(s"text: $text")
    println(s"bagOfWords: $bagOfWords")


  def main(args: Array[String]): Unit =
    println("==>main")
    sentencesEx01()
    wordSegmentationEx01()
