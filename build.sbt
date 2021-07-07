name := "Scala-Learn"

version := "0.1"

scalaVersion := "2.13.6"

idePackagePrefix := Some("com.Learning.ScalaLearn")

val scalatestVersion = "3.2.7"


// https://mvnrepository.com/artifact/org.scalatest/scalatest
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % scalatestVersion,
  "org.scalatest" %% "scalatest" % scalatestVersion % "test")