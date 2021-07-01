package com.Learning.ScalaLearn

object Basics extends App{

  //val is like a constant -> once define the value cannot be changed
  val a: Int = 46

  //Int, Char, Boolean, Double, Float, String
  val bool = false

  //String operations
  val aString = "I love Target"
  val aComposedString = "I" + " " + "love" + " " + "target!"
  val anInterpolatedString = s"value injection $a"

  //expressions -> anything that can be reduced to a value
  val anExpression = 2 + 3

  //if-expressions
  val anIfExpression = if (a > 5) 20 else 21

  //nested-if expressions
  val aNestedIf = if(a < 5) {
    if (a < 4 ){
      if (a < 3)
        "value less than 3"
    }
  }

  //code-blocks -> curly braces enclosed;last statement is the return statement
  val aCodeBlock = {
    val aLocalVal = 10
    aLocalVal + 3
  }


}
