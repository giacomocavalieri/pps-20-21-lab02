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

  def assertEmpty[A](optional: Option[A]): Unit = assertTrue(isEmpty(optional))
}
