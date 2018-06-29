package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)
      result
    }
  println(factorial(10))

  /*
  * Error...!
  * println(factorial(5000))
  * */

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factorialHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factorialHelper(x - 1, x * accumulator)
    factorialHelper(n, accumulator = 1)
  }
  println(anotherFactorial(5000))

  /*
  * 1. Concatenate function tail recursive
  * 2. Is prime function tail recursive
  * 3. Fibonacci function tail recursive
  * */

  // 1. Concatenate function tail recursive
  @tailrec
  def concatenateTailRec(aString: String, n: Int, accumulator: String = ""): String =
    if (n <= 0) accumulator
    else concatenateTailRec(aString, n - 1, aString + " " + accumulator)
  println(concatenateTailRec(aString ="hm", n = 3))

  // 2. Is prime function tail recursive
  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailRec(t: Int, isStillPrime: Boolean = true): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailRec(t - 1, n % t != 0 && isStillPrime)
    isPrimeTailRec(n / 2)
  }
  println(isPrime(2003))
  println(isPrime(629))

  // 3. Fibonacci function tail recursive
  def fibonacci(n: Int): Int = {
    @tailrec
    def fiboTailRec(i: Int, last: Int = 1, nextToLast: Int = 1): Int =
      if (i >= n) last
      else fiboTailRec(i + 1, last + nextToLast, last)

    if (n <= 2) 1
    else fiboTailRec(2)
  }
  println(fibonacci(8))

}