package lectures.part1basics

object Functions extends App {

  def aFuntion(a: String, b: Int): String = {
    a + " " + b
  }
  println(aFuntion("Hello", 3))

  def aParameterlessFunction () :Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction)

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
  * 1. String whatever
  * 2. Factorial
  * 3. Fibonacci
  * */


}
