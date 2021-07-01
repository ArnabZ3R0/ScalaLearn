package com.Learning.ScalaLearn

object ObjectOrient extends App{

  //class and instance
  class Animal {
    //defining value
    val age = 0

    //defining functions/methods
    def eat = println("I'm eating")
  }

  val anAnimal = new Animal

  //inheritance
  class Dog(val name:String) extends Animal //Constructor Definition
  val aDog = new Dog("Judo")

  println(aDog.age) // Can access the parent class fields and methods

  // abstract class
  abstract class WalkingAnimal{
    val hasLegs = true //all fields and methods are by default public but we can specify private or protected
    def walk : Unit
  }

  //Interface -> everything unimplemented
  trait Carnivore{
    def eat(animal: Animal) : Unit
  }

  /*Abtract classes and traits cannot be instantiated by themselves, we need to extend them to other class, which in turn can be instantiated*/

  //Can extends only one class however can include multiple traits
  class Crocodile extends Animal with Carnivore{
    override def eat(animal: Animal): Unit = {
      println(s"I'm eating you, Animal")
    }
  }

  val aCroc = new Crocodile

  aCroc.eat(aDog)
  aCroc eat aDog

  /*Singleton Object*/
  object MySingleton { // This signifies that only one object can be created for the MySingleton class
    val mySpecialValue = 64764644
    def mySpecialMethod = mySpecialValue + 10
    def apply(x : Int) = x + 10
  }

  println(MySingleton.mySpecialMethod)
  println(MySingleton(20)) //Apply method is used here. We are using the object as a function here just by passing the argument

  /*Case Classes*/
  case class Person(name: String,age : Int)

  /*Exceptions*/
  try {
    //code that might throw an object , exception
    val x : String = null
    x.length
  } catch {
    case e: Exception => println("Some Error Occured")
  } finally {
    // execute no matter what; useful for closing connections,deleting files etc
  }
























  /*class Animal(val species: String) {
    val age = 10
    def walk = println(s"Here's how a $species walks and his age is $age")
  }

  val aDog = new Animal("dog")
  val aCat = new Animal("cat")

  aDog.walk
  aCat.walk*/
}
