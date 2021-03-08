package lab

object Task2A {
  val parityVal: Int => String = {
    case n if n % 2 == 0 => "even"
    case _ => "odd"
  }

  def parityMethod(n: Int): String = n match {
    case n if n % 2 == 0 => "even"
    case _ => "odd"
  }

  val negVal: (String => Boolean) => String => Boolean = predicate => !predicate(_)

  def negMethod(predicate: String => Boolean): String => Boolean = !predicate(_)
}
