package lab

import lab.Task3._
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class Task3Test {
  @Test def testFibonacci() {
    testFibonacciNumbers(fib)
  }

  @Test def testTailRecursiveFibonacci(): Unit = {
    testFibonacciNumbers(fibTail)
  }

  def testFibonacciNumbers(fib: Int => Int) {
    assertEquals(0, fib(0))
    assertEquals(1, fib(1))
    assertEquals(1, fib(2))
    assertEquals(3, fib(4))
    assertEquals(13, fib(7))
  }
}
