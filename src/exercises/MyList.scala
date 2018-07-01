package exercises

abstract class MyList[+A] {
  /*
  * head     - First element of the list
  * tail     - Remainder of the list
  * isEmpty  - Is this list empty
  * add(Int) - New list with this element added
  * toString - Returns a String representation od the list
  * */
  def head: A
  def tail: MyList[A]
  def isEmpty: Boolean
  def add[B >: A](element:B): MyList[B]
  def printElements: String
  override def toString: String = "[" + printElements + "]"
}

object Empty extends MyList[Nothing] {
  def head: Nothing = throw new NoSuchElementException
  def tail: MyList[Nothing] = throw new NoSuchElementException
  def isEmpty: Boolean = true
  def add[B >: Nothing](element:B): MyList[B] = new Cons(element, Empty)
  def printElements: String = ""
}

class Cons[+A](h: A, t: MyList[A]) extends MyList[A] {
  def head: A = h
  def tail: MyList[A] = t
  def isEmpty: Boolean = false
  def add[B >: A](element:B): MyList[B] = new Cons(element, this)
  def printElements: String =
    if (t.isEmpty) "" + head
    else h + " " + t.printElements
}

object ListTest extends App {
  val list = new Cons(1, new Cons(2, new Cons(3, Empty)))
  println(list.head)
  println(list.tail.head)
  println(list.tail.tail.head)
  println(list.add(4).head)
  println(list.add(4).toString)
  println(list.isEmpty)
  println(list.toString)

  val listOfIntegers = new Cons(7, new Cons(8, new Cons(9, Empty)))
  val listOfStrings  = new Cons("Hello", new Cons("Scala", Empty))
  println(listOfIntegers.toString)
  println(listOfStrings.toString)

}