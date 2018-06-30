package lectures.part2oop

object Objects extends App {

  ////////////////
  // Companions //
  ////////////////
  object Person {
    val N_EYES = 2
    def canFlay = false
    def apply(mother: Person, father: Person): Person = new Person(name = "Bobbie")
  }
  class Person(val name: String) {}
  ////////////////

  println(s"Eyes: ${Person N_EYES}")
  println(Person canFlay)

  val mary = new Person(name = "Mary")
  val john = new Person(name = "John")

  val bobbie = Person(mother = mary, father = john)

}
