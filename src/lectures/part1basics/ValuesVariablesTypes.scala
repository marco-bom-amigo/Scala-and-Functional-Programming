package lectures.part1basics

object ValuesVariablesTypes extends App {

  // Vals are immutable
  val x: Int = 42
  val y = 43
  val z = y + 1
  println(x)
  println(y)
  println(z)

  val aString: String = "hello"
  val bString = "hello"

  val aBoolean: Boolean = true
  val bBoolean = false

  val aChar:Char = 'a'
  val bChar = 'b'

  val aShort: Short = 123
  val aLong: Long = 987654321012345678L
  val aFloat: Float = 2.0f
  val aDouble: Double = 4.0

  var aVariable: Int = 4
  aVariable = 5

}