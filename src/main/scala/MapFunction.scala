package com.Learning.ScalaLearn

object MapFunction extends App{
  val list = 1 to 100

  val modList = list.map(x => {
    if ((x % 3) == 0) x
    else -1
  }).filter(_ != -1)

  modList.foreach(println)

}
