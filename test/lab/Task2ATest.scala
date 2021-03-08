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

  @Test def testNegVal(): Unit = {
    val empty: String => Boolean = _ == ""
    val notEmpty = negVal(empty)
    assertTrue(notEmpty("foo"))
    assertFalse(notEmpty(""))
  }
}
