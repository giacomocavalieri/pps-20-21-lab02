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
    val predicate: Int => Boolean = _ > 3
    assertEmpty(filter(emptyOptional, predicate))
  }

  def assertEmpty[A](optional: Option[A]): Unit = assertTrue(isEmpty(optional))
}
