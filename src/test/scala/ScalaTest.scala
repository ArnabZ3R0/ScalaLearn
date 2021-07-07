package com.Learning.ScalaLearn

import org.scalatest.funspec.AnyFunSpec

object ScalaTest

class CalculatorFunSpec extends AnyFunSpec{

  val calculator = new Calculator

  describe("multiplication") {
    it("should give 0 if multiply by 0") {
      assert(calculator.multiply(213123,0) == 0)
      assert(calculator.multiply(-231321,0) == 0)
    }
  }

  describe("division"){
    it("should throw error if divide by 0"){
      assertThrows[ArithmeticException](calculator.divide(23131,0))
    }
  }

}
