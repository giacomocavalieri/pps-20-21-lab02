package lab

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import lab.Optionals.Option._

class OptionalsTest {
  @Test def filterOnEmptyOptionalTest(): Unit = {
    assertEquals(None(), filter(None[Int](), (_: Int) > 3))
  }
}
