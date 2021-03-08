package lab

import Shapes.Shape
import Shapes.Shape._
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class ShapesTest {
  val doubleDelta = 0.001

  @Test def testCircle() {
    val circleRadius = 11.1
    val circle = Circle(circleRadius)
    testShapePerimeter(math.Pi * 2 * circleRadius, circle)
    testShapeArea(math.Pi * circleRadius * circleRadius, circle)
  }

  @Test def testRectanglePerimeter() {
    val edge1 = 11.1
    val edge2 = 1.11
    val rectangle = Rectangle(edge1, edge2)
    testShapePerimeter((edge1 + edge2) * 2, rectangle)
    testShapeArea(edge1 * edge2, rectangle)
  }

  @Test def testSquarePerimeter(): Unit = {
    val edge = 11.1
    val square = Square(edge)
    testShapePerimeter(edge * 4, square)
    testShapeArea(edge * edge, square)
  }

  def testShapePerimeter(expected: Double, shape: Shape) {
    testShapeMap(expected, shape, perimeter)
  }

  def testShapeArea(expected: Double, shape: Shape) {
    testShapeMap(expected, shape, area)
  }

  def testShapeMap(expected: Double, shape: Shape, map: Shape => Double) {
    assertEquals(expected, map(shape), doubleDelta)
  }
}
