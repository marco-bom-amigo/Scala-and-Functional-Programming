package lectures.part4pm

import scala.util.Random

object PatternMatching extends App {
  val random = new Random
  val x = random.nextInt(10)
  val description = x match {
    case 1 => "The One"
    case 2 => "double or nothing"
    case _ => "something eles"
  }
  case class Person(name: String, age: Int)
  val bob = Person("Bob", 20)
  val greeting = match bob {
    case Person(a, b) => s"Hi, my name is $a."
    case _ => "Hi...?!"
  }

  val isEven = x match {
    case n if n % 2 == 0 => true
    case _ => false
  }

}
