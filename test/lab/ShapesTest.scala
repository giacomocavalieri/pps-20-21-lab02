package lab

import Shapes.Shape._
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class ShapesTest {
  val doubleDelta = 0.001

  @Test def testCircle() {
    val circleRadius = 11.1
    val circle = Circle(circleRadius)
    assertEquals(math.Pi * 2 * circleRadius, perimeter(circle), doubleDelta)
    assertEquals(math.Pi * circleRadius * circleRadius, area(circle), doubleDelta)
  }

  @Test def testRectangle() {
    val edge1 = 11.1
    val edge2 = 1.11
    val rectangle = Rectangle(edge1, edge2)
    assertEquals((edge1 + edge2) * 2, perimeter(rectangle), doubleDelta)
    assertEquals(edge1 * edge2, area(rectangle), doubleDelta)
  }

  @Test def testSquare(): Unit = {
    val edge = 11.1
    val square = Square(edge)
    assertEquals(edge * 4, perimeter(square), doubleDelta)
    assertEquals(edge * edge, area(square), doubleDelta)
  }
}
