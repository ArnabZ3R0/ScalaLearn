package com.Learning.ScalaLearn

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class ScalaFlatSpec extends AnyFlatSpec with should.Matchers {

  val flatSpec = new flatSpec

  behavior of "multiplication"
    it should "return 0 always" in {
      assert(flatSpec.multiply(312123) == 0)
    }

  behavior of "division"
    it should "throw exception if divide by 0" in {
      assertThrows[ArithmeticException](flatSpec.divide(5,0))
    }
    it should "return 3" in {
      assert(flatSpec.divide(6,2) == 3)
    }

}
