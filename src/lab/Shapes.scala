package lab

object Shapes {
  sealed trait Shape
  object Shape {
    case class Circle(radius: Double) extends Shape

    def perimeter(shape: Shape): Double = shape match {
      case Circle(radius) => 2 * math.Pi * radius
    }
  }
}
