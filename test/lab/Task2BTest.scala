package lab

import lab.Task2B._
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class Task2BTest {
  @Test def testCurriedVal() {
    testCurriedFunction(curriedVal)
  }

  @Test def testNonCurriedVal() {
    nonCurriedVal(1, 2, 3)
  }

  @Test def testCurriedDef() {
    testCurriedFunction(curriedDef)
  }

  @Test def testNonCurriedDef() {
    nonCurriedDef(1, 2, 3)
  }

  def testCurriedFunction(f: Int => Int => Int => Boolean) {
    val partiallyApplied = f(10)(11)
    assertTrue(partiallyApplied(12))
    assertFalse(partiallyApplied(9))
  }

  def testNonCurriedFunction(f: (Int, Int, Int) => Boolean) {
    assertTrue(f(10, 11, 12))
    assertFalse(f(10, 11, 9))
  }
}
