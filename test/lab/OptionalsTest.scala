package lab

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import lab.Optionals.Option
import lab.Optionals.Option._

class OptionalsTest {
  val emptyOptional: Option[Int] = None()
  val optionalValue = 11
  val optional: Option[Int] = Some(optionalValue)

  @Test def filterOnEmptyOptionalTest(): Unit = {
    assertEmpty(filter(emptyOptional)(_ > 3))
  }

  @Test def filterOnOptional(): Unit = {
    assertNotEmpty(filter(optional)(_ == optionalValue))
    assertEmpty(filter(optional)(_ != optionalValue))
  }

  @Test def testMapOnEmptyOptional(): Unit = {
    assertEmpty(map(emptyOptional)(_ * 3))
  }

  @Test def testMapOnOptional(): Unit = {
    val mappedOptional = map(optional)({
      case n if n == optionalValue => "success"
      case _ => "fail"
    })
    val expectedOptional = Some("success")
    assertEquals(expectedOptional, mappedOptional)
  }

  @Test def testMap2WithEmptyInput(): Unit = {
    assertEmpty(map2(optional)(emptyOptional)(_ + _))
    assertEmpty(map2(emptyOptional)(optional)(_ + _))
    assertEmpty(map2(emptyOptional)(emptyOptional)(_ + _))
  }

  @Test def testMap2(): Unit = {
    val stringOptional = map(optional)(_.toString)
    val mappedOptional = map2(optional)(stringOptional)(_ + " " + _)
    val expectedOptional = Some("11 11")
    assertEquals(expectedOptional, mappedOptional)
  }

  def assertEmpty[A](optional: Option[A]): Unit = assertTrue(isEmpty(optional))

  def assertNotEmpty[A](optional: Option[A]): Unit = assertFalse(isEmpty(optional))
}
