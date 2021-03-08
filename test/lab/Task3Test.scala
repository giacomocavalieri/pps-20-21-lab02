package lab

import lab.Task3._
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class Task3Test {
  @Test def testFibonacci() {
    testFirstFibonacciNumbers(fib)
    testFibonacciNumbers(fib)
  }

  @Test def testTailRecursiveFibonacci(): Unit = {
    testFirstFibonacciNumbers(fibTail)
    testFibonacciNumbers(fibTail)
  }

  def testFirstFibonacciNumbers(fib: Int => Int) {
    assertEquals(0, fib(0))
    assertEquals(1, fib(1))
    assertEquals(1, fib(2))
  }

  def testFibonacciNumbers(fib: Int => Int): Unit = {
    assertEquals(3, fib(4))
    assertEquals(13, fib(7))
  }
}
