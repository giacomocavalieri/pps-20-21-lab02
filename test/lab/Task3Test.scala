package lab

import lab.Task3.fib
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class Task3Test {
  @Test def testFirstFibonacciNumbers() {
    assertEquals(0, fib(0))
    assertEquals(1, fib(1))
    assertEquals(1, fib(2))
  }

  @Test def testFibonacciNumbers(): Unit = {
    assertEquals(3, fib(4))
    assertEquals(13, fib(7))
  }
}
