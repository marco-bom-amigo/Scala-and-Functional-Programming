package lectures.part2oop

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def +(person: Person):String = s"${this.name} is friend of ${person.name}"
    def +(nickname:String): Person = new Person(name = s"$name ($nickname)", favoriteMovie = favoriteMovie)

    def unary_! : String = s"$name what the heck?!"
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)

    def isAlive: Boolean = true

    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie!!"
    def apply(n: Int): String = s"$name watched $favoriteMovie $n times...!"

    def learns(thing: String): String = s"$name is learning $thing"
    def learnsScala: String = this learns "Scala"

  }

  val mary = new Person(name = "Mary", favoriteMovie = "Inception")
  println(mary.likes(movie = "Inception"))
  println(mary likes "Inception")

  val tom = new Person(name = "Tom", favoriteMovie = "Fight Club")
  println(mary hangOutWith tom)
  println(mary + tom)
  println(mary.+(tom))

  println(1 + 2)
  println(3.+(4))

  val x = -1
  val y = 1.unary_-

  println(!mary)

  println(mary isAlive)
  println(mary.isAlive)

  println(mary.apply())
  println(mary())

  /*
  * 1. Overload the + operator, which receive an string and return a person with a nickname, between parenthesis
  *   mary + "Nickname"
  * 2. Add an age to the person class, and add an unary operator, which increment age
  *   +mary
  * 3. Add a "learns" method
  *     mary learns Scala
  *    Add a learnsScala method, calls the learns method, with "Scala"
  * 4. Overload the Apply method
  *     mary(2) "Mary watched Inception 2 times."
  * */

  println((mary + "the Rockstar")())
  println((+mary).age)
  println(mary learnsScala)
  println(mary(8))

}