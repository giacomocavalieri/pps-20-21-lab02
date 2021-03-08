package lab

object Task3 {
  def fib(n: Int): Int = n match {
    case 0 => 0
    case 1 | 2 => 1
    case n if n > 0 => fib(n-1) + fib(n-2)
  }
}
