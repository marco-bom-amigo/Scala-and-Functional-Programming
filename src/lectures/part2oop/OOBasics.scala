package lectures.part2oop

object OOBasics extends App {

  val bona = new Person(name = "Bona",age = 28)
  val cah  = new Person(name = "Cah" ,age = 27)
  println(bona.name)
  println(cah.name)

  bona.greet(cah.name)
  bona.greet()

  val author: Writer = new Writer(firstName = "Charles", surname =  "Dickens", year =  1812)
  val imposter: Writer = new Writer(firstName = "Charles", surname =  "Dickens", year =  1812)
  val novel = new Novel(name = "Great Expectations", yearOfRelease =  1861, author = author)

  println(novel.authorAge)
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(imposter))

  val counter = new Counter
  counter.inc.print
  counter.inc.inc.inc.print

}

class Person(val name: String, age: Int) {

  val x = 2

  println(1 + 3 + "always executed during instantiation...")

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name.")
  def greet(): Unit = println(s"Hi, I am ${this.name}.")

  def this(name:String) = this(name, 0)
  def this() = this("Marco Bonamichi")

}

/*
* Novel and Writer
*
* Writer: first name, surname, year
* - method fullname
*
* Novel: name, year of releases, author
* - authorAge
* - isWrittenBy(autor)
* - copy(new year of release) = new instance of Novel
*
* Counter class
* - receives an int
* - current count
* - method to increment/decrement => new counter
* - overload inc/dec to receive as parameter an amount
* */

class Writer(firstName: String, surname: String, year: Int) {
  def fullname: String = s"${this.firstName} ${this.surname}"
  def age(): Int = this.year
}

class Novel(name: String, yearOfRelease: Int, author: Writer) {
  def authorAge: Int = yearOfRelease - author.age()
  def isWrittenBy(author: Writer): Boolean = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

class Counter(val count: Int = 0) {
  def inc: Counter = new Counter(count + 1)
  def dec: Counter = new Counter(count - 1)
  def print: Unit = println(count)
}