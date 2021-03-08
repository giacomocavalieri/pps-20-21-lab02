package lab

object Shapes {
  sealed trait Shape
  object Shape {
    case class Circle(radius: Double) extends Shape
    case class Rectangle(edge1: Double, edge2: Double) extends Shape

    def perimeter(shape: Shape): Double = shape match {
      case Circle(radius) => 2 * math.Pi * radius
      case Rectangle(edge1, edge2) => 2 * (edge1 + edge2)
    }
  }
}
