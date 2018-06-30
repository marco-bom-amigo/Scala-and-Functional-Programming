package lectures.part2oop

object InheritanceAndTraits extends App {

  class Animal {
    val hungry = true
    val creatureType = "wild"
    def eat: Unit = println("Nhac nhac nhac...")
    protected def born: Unit = println("...")
  }
  class Cat extends Animal {
    private def scratch: Unit = println("Miaw!!")
    born
    scratch
  }

  val cat: Cat = new Cat
  cat eat

  class Person(name: String, age: Int) {
    def this(name:String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  class Dog(override val creatureType: String = "domestic") extends Animal {
    override val hungry = false
    override def eat: Unit = {
      super.eat
      println("Crunch crunch...")
    }
    private def scratch: Unit = println("Owf!!")
    born
    scratch
  }

  val dog: Dog = new Dog(creatureType = "K9")
  dog.eat
  println(dog.creatureType)
  println(dog.hungry)

  val unknownAnimal: Animal = new Dog(creatureType = "K9")
  unknownAnimal.eat

}