package lectures.part2oop

object AbstractDataTypes extends App {

  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal {
    val creatureType: String = "Canine"
    def eat: Unit = println("Crunhc crunch...")
  }

  trait Carnivore {
    def eat(animal: Animal): Unit
    val preferredMeal: String = "fresh meat"
  }
  trait coldBlooded {
    def bleed:Unit = println("I am a cold blooded animal!! Be careful!!")
  }

  class Crocodile extends Animal with Carnivore with coldBlooded {
    val creatureType: String = "Reptile"
    def eat: Unit = println("Nhac nhac...")
    def eat(animal: Animal): Unit = println(s"I am a Crocodile and I am eating a ${animal.creatureType}...!")
    def meal:Unit = println(s"My preferred meal is ${preferredMeal}")
  }

  val dog: Dog = new Dog
  val croc: Crocodile = new Crocodile
  croc.eat(dog)
  croc.bleed
  croc.meal

}