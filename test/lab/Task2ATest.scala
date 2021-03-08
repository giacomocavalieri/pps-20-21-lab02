package lab

import lab.Task2A._
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class Task2ATest {
  @Test def testParityVal() {
    testParity(parityVal)
  }

  @Test def testParityMethod() {
    testParity(parityMethod)
  }

  def testParity(parityFunction: Int => String): Unit = {
    assertEquals("even", parityFunction(2))
    assertEquals("odd", parityFunction(1))
  }

  @Test def testNegVal() {
    testNeg(negVal)
  }

  @Test def testNegMethod() {
    testNeg(negMethod)
  }

  @Test def testGenericNegOnStrings() {
    testNeg(genericNeg)
  }

  @Test def testGenericNegOnInt() {
    val equals5: Int => Boolean = _ == 5
    val not5 = genericNeg(equals5)
    assertTrue(not5(4))
    assertFalse(not5(5))
  }

  def testNeg(neg: (String => Boolean) => String => Boolean) {
    val empty: String => Boolean = _ == ""
    val notEmpty = neg(empty)
    assertTrue(notEmpty("foo"))
    assertFalse(notEmpty(""))
  }
}
