package lectures.part2oop

object Exceptions extends App {

  val x: String = null
  // println(x.length)
  // val aWeirdValue = throw new NullPointerException

  def getInt(withExceptions: Boolean): Int =
    if (withExceptions) throw new RuntimeException("No int for you!")
    else 42

  val potentialFail = try {
    getInt(withExceptions = true)
  } catch {
    case e: RuntimeException     => 43
    case e: NullPointerException => 44
  } finally {
    println("finally")
  }

  println(potentialFail)

  class MyException extends Exception
  val exception: MyException = new MyException
  //throw exception

  // val array = Array.ofDim(Int.MaxValue)

  // def infinite(): Int = 1 + infinite()
  // val noLimit = infinite()

  class OverFlowException extends RuntimeException
  class UnderFlowException extends RuntimeException
  class MathCalculationException extends RuntimeException("Division by 0")
  object PocketCalculator {
    def add(x:Int, y:Int):Int = {
      val result = x + y
      if (x > 0 && y > 0 && result < 0) throw new OverFlowException
      else if (x < 0 && y < 0 && result > 0) throw new UnderFlowException
      else result
    }
    def subtract(x:Int, y:Int):Int = {
      val result = x - y
      if (x > 0 && y < 0 && result < 0) throw new OverFlowException
      else if (x < 0 && y > 0 && result > 0) throw new UnderFlowException
      else result
    }
    def multiply(x:Int, y:Int):Int = {
      val result = x * y
      if (x > 0 && y > 0 && result < 0) throw new OverFlowException
      else if (x < 0 && y < 0 && result < 0) throw new OverFlowException
      else if (x > 0 && y < 0 && result > 0) throw new UnderFlowException
      else if (x < 0 && y > 0 && result > 0) throw new UnderFlowException
      else result
    }
    def divide(x:Int, y:Int):Int = {
      if (y == 0) throw new MathCalculationException
      else x / y
    }
  }

  println(PocketCalculator.divide(2, 0))

}