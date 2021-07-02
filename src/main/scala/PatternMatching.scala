package com.Learning.ScalaLearn

object PatternMatching extends App{

  // switch expression
  val anInteger = 45
  val order = anInteger match {
    case 1 => "First"
    case 2 => "Second"
    case _ => anInteger //default case
  }
  println(order)

  //Case classes pattern Matching
  case class Person(name : String,age : Int)

  val Arnab = new Person("Arnab",25)

  val personGreeting = Arnab match {
    case Person(n,a) => s"Hi $n, you are $a years old"
    case _ => "Case not matched"
  }

  //Collections pattern matching
  val aTuple = (1,"Arnab","kolkata")
  val isCitizen  = aTuple match {
    case (id,name,placeOfResidence) => true
    case _ => false
  }

  //decomposing Lists
  val aList = List(1,2,3)
  val middle2 = aList match {
    case List(_,1,_) => true
    case _ => false
  }

  println(middle2)

  /*
  * Pattern Matching matches cases top to bottom
  * */


}
