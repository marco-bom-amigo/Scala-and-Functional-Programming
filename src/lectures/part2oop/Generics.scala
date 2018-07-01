package lectures.part2oop

object Generics extends App {

  trait MyTrait[A] {}
  class MyMap[Key, Value]

  class MyList[+A] {
    def add[B >: A](element: B): MyList[B] = new MyList[B]
  }
  object MyList {
    def empty[A]: MyList[A] = new MyList[A]
  }

  val listOfIntegers = new MyList[Int]
  val listOfStrings  = new MyList[String]

  val emptyListOfIntegers = MyList.empty[Int]

  class Animal
  class Cat extends Animal
  class Dog extends Animal

  val animal: Animal = new Cat

  class CovariantList[+A]
  val animalList: CovariantList[Animal] = new CovariantList[Cat]

  class InvariantList[A]
  val invariantAnimal: InvariantList[Animal] = new InvariantList[Animal]

  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]

  class Cage[A <: Animal](animal: A)
  val cage = new Cage(new Dog)



}
