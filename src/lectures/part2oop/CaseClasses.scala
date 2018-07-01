package lectures.part2oop

object CaseClasses extends App {

  case class Person(name: String, age: Int)

  val jim  = new Person(name = "Jim", age = 34)
  val jim2 = new Person(name = "Jim", age = 34)
  println(jim.name)
  println(jim.toString)
  println(jim)
  println(jim == jim2)

  val jim3 = jim.copy(age = 45)
  println(jim == jim3)

  val thePerson = Person
  val mary = Person("Mary", 23)

  case object UnitedKingdom {
    def name: String = "The UK of GB and NI"
  }

}
