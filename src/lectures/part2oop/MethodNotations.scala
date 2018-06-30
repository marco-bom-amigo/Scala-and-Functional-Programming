package lectures.part2oop

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def +(person: Person):String = s"${this.name} is friend of ${person.name}"
    def unary_! : String = s"$name what the heck?!"
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie!!"
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

}
