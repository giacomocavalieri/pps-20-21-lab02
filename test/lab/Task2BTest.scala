package lab

import lab.Task2B._
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class Task2BTest {
  @Test def testCurriedVal() {
    testCurriedFunction(curriedVal)
  }

  @Test def testNonCurriedVal() {
    testNonCurriedFunction(nonCurriedVal)
  }

  @Test def testCurriedDef() {
    testCurriedFunction(curriedDef)
  }

  @Test def testNonCurriedDef() {
    testNonCurriedFunction(nonCurriedDef)
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

  @Test def testComposition() {
    val f: String => Boolean = {
      case "pos" => true
      case "neg" => false
    }
    val g: Int => String = {
      case n if n > 0 => "pos"
      case _ => "neg"
    }
    val isPositive = compose(f, g)

    assertTrue(isPositive(10))
    assertFalse(isPositive(-10))
  }
}
