package com.Learning.ScalaLearn

import scala.collection.IterableOnce.iterableOnceExtensionMethods

object FunctionalProgramming extends App{

  /*Scala is OO*/
  class Person(name : String ) {
    def apply(age : Int) = {
      println(s"$name's age is $age")
    }
  }
  val Arnab = new Person("Arnab")
  Arnab.apply(25)
  Arnab(25) // INVOKING Arnab which is an object as a function === Arnab.apply(25)

  /*Functions*/
  val doubler : Int => Int = (x: Int) => 2 * x
  val doublerReturnTypeOmitted = (x:Int) => 2 * x
  println(doubler(4))
  println(doubler(4))
  val myFunc = (x: Int) => x + 1

  /*Higher order Functions -> One function is passed as an argument or returned from another function*/
  val myList = List(1,2,3).map(x => x + 1) // Here Map is HOF as we are passing an anonymous function to map
  val myList2 = List(1,2,3).map(myFunc) //Defining my function and then applying map
  println(myList)
  println(myList2)
  val myList3 = List(1,2,3).filter(x => x >= 2)
  println(myList3)

  /*For comprehensions*/
  val allPairs = for {
    number <- List(1,2,3)
    letter <- List('a','b','c')
  } yield s"$number-$letter"
  println(allPairs)

  /**
   * Collections
   */

  /*Lists*/
  val aList = List(1,2,3)
  val firstEle = aList.head
  val rest = aList.tail
  val aPrependedList = 0 :: aList //List(0,1,2,3)
  val aModifiedList = 1 +: aList :+ 4 // List(1,1,2,3,4)

  /*sequences -> Access element from a given index, basically array*/
  val aSeq = Seq(11,43,23)
  println(aSeq(1)) // 43
  println(aSeq(0)) // 11

  /*vectors -> special sequence for very large data
   */

  val aVector = Vector(1,2,3,4,5,6,7) // Very fast access time

  /*sets -> no duplicates*/
  val aSet = Set(1,1,1,1,2,3,4,5,5,5)
  val setHas5 = aSet.contains(5) //true
  println(aSet)

  /*ranges*/

  val aRange = 1 to 100
  val evenNumbers = aRange.filter(_ <= 50 ).map(_ * 2).toList
  println(evenNumbers)

  /*Tuples -> Basically a record/row in a database table*/
  val aTuple = (1,"Arnab","80k")
  println(aTuple)

  /*maps -> key value pair*/
  val aPhoneBook = Map(
    ("Arnab",798012313),
    ("Tithi",629165967)
  )
  println(aPhoneBook)





























}
