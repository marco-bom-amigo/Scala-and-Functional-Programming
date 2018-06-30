package exercises

abstract class MyList {
  /*
  * head     - First element of the list
  * tail     - Remainder of the list
  * isEmpty  - Is this list empty
  * add(Int) - New list with this element added
  * toString - Returns a String representation od the list
  * */
  def head: Int
  def tail: MyList
  def isEmpty: Boolean
  def add(element:Int): MyList
  def printElements: String
  override def toString: String = "[" + printElements + "]"
}

object Empty extends MyList {
  def head: Int = throw new NoSuchElementException
  def tail: MyList = throw new NoSuchElementException
  def isEmpty: Boolean = true
  def add(element:Int): MyList = new Cons(element, Empty)
  def printElements: String = ""
}

class Cons(h: Int, t: MyList) extends MyList {
  def head: Int = h
  def tail: MyList = t
  def isEmpty: Boolean = false
  def add(element:Int): MyList = new Cons(element, this)
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
}