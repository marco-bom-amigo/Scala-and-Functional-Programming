package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2

  println(x)

  println(2 + 3 * 4)
  println(1 == 3)
  println(1 != 3)

  println(!(1 == 3))
  println(!(1 != 3))

  var aVariable = 2
  aVariable += 2; println(aVariable)
  aVariable -= 2; println(aVariable)
  aVariable *= 2; println(aVariable)
  aVariable /= 2; println(aVariable)

  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3
  println(aConditionedValue)

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  val aWeirdValue = (aVariable = 3)
  println(aWeirdValue)

  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (x > 2) "hello" else "goodbye"
  }

  val someValue = {
    2 < 3
  }
  println(someValue)

  val someOtherValue = {
    if (someValue) 239 else 986
    42
  }
  println(someOtherValue)

}