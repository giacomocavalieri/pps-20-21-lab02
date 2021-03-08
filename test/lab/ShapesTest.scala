package lab

import Shapes.Shape
import Shapes.Shape._
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class ShapesTest {
  val doubleDelta = 0.001

  @Test def testCirclePerimeter() {
    val circleRadius = 4
    val circle = Circle(circleRadius)
    testShapePerimeter(2 * math.Pi * circleRadius, circle)
  }

  @Test def testRectanglePerimeter() {
    val edge1 = 11.1
    val edge2 = 1.11
    val rectangle = Rectangle(edge1, edge2)
    testShapePerimeter((edge1 + edge2) * 2, rectangle)
  }

  def testShapePerimeter(expected: Double, shape: Shape) {
    assertEquals(expected, perimeter(shape), doubleDelta)
  }
}
