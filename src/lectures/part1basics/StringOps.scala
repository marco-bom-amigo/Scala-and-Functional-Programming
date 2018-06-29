package lectures.part1basics

object StringOps extends App {

  val string: String = "Hello, I am learning Scala...!"

  println(string.charAt(4))
  println(string.substring(7, 11))
  println(string.split(" ").toList)
  println(string.startsWith("Hello"))
  println(string.replace("Scala...!", "Scala and Spark...?!"))
  println(string.toLowerCase())
  println(string.length())

  val aNumberString = "2"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  println(aNumberString.reverse)
  println(string.take(2))

  val name = "Bonamichi"
  val age = 28
  val greeting = s"Hello, my name is $name and I am $age years old."
  println(greeting)

  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age + 1}"
  println(anotherGreeting)

  val speed = 1.26842f
  val myth = f"$name%s can eat $speed%2.2f burgers per minute"
  println(myth)

  val escaped =  "This is \n new line"
  println(raw"This is \n new line")
  println(raw"$escaped")

}