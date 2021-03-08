package lab

import Shapes.Shape._
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class ShapesTest {
  val doubleDelta = 0.001

  @Test def testCirclePerimeter() {
    val circleRadius = 4
    val circle = Circle(circleRadius)
    assertEquals(2 * math.Pi * circleRadius, perimeter(circle), doubleDelta)
  }
}
