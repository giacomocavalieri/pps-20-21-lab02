package lab

object Trees extends App {
  sealed trait Tree[A]
  object Tree {
    case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]
    case class Leaf[A](value: A) extends Tree[A]

    def size[A](tree: Tree[A]): Int = reduce(tree, (_: Int) + (_: Int), (_: A) => 1)

    def find[A](tree: Tree[A], toFind: A): Boolean =
      reduce(tree, (_: Boolean) || (_: Boolean), (_: A) == toFind)

    def count[A](tree: Tree[A], toCount: A): Int =
      reduce(tree, (_: Int) + (_: Int), (_: A) match {
        case value if value == toCount => 1
        case _ => 0
      })

    def reduce[A, B](tree: Tree[A], f: (B, B) => B, base: A => B): B = tree match {
      case Branch(left, right) => f(reduce(left, f, base), reduce(right, f, base))
      case Leaf(value) => base(value)
    }
  }

  import Tree._
  val tree = Branch(Branch(Leaf(1), Leaf(2)), Leaf(1))
  println(tree, size(tree)) // ..., 3
  println(find(tree, 1)) // true
  println(find(tree, 4)) // false
  println(count(tree, 1)) // 2
}
