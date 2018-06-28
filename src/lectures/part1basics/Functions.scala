package lectures.part1basics

object Functions extends App {

  def aFuntion(a: String, b: Int): String = {
    a + " " + b
  }
  println(aFuntion("Hello", 3))

  def aParameterlessFunction () :Int = 42
  println(aParameterlessFunction())
  // println(aParameterlessFunction)

  def aRepeatedFunciotn(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunciotn(aString, n - 1)
  }
  println(aRepeatedFunciotn("Hello ", n = 3))

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFuntion(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b
    aSmallerFunction(n, n - 1)
  }
  /*
  * 1. Greeting
  * 2. Factorial
  * 3. Fibonacci
  * 4. A number is prime
  * */

  def greetingForKids(name: String, age: Int): String =
    "Hi, my name is " + name + " and I am " + age + " years old."
  println(greetingForKids(name = "Marco", age =  28))

  def factorial(n: Int): Int =
    if (n <= 0) 1
    else n * factorial(n - 1)

  println(factorial(5))



}
