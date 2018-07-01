package lectures.part2oop

object AnonymousClasses extends App {

  abstract class  Animal {
    def eat: Unit
  }

  /*
   *  class AnonymousClasses$$anon$1 extends Animal {
   *    override def eat: Unit = println("Hahahahaha...!")
   *  }
   *  val funnyAnimal: new AnonymousClasses$$anon$1
   * */

  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("Hahahahaha...!")
  }
  println(funnyAnimal.getClass)

  class Person(name: String) {
    def sayHi: Unit = println(s"Hi, my name is $name, how can I help?")
  }

  val jim = new Person(name = "Jim") {
    override def sayHi: Unit = println(s"Hi, my name is Jim, how can I be of service?")
  }

}
