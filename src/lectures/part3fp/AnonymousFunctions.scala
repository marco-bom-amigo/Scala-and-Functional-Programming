package lectures.part3fp

object AnonymousFunctions extends App {

  val doublerOld = new Function1[Int, Int] {
    override def apply(x: Int) = x * 2
  }

  val double0: Int => Int = (x: Int) => x * 2
  val doubler = (x: Int) => x * 2

  val adder0:(Int, Int) => Int = (a: Int, b: Int) => a + b
  val adder1 = (a: Int, b: Int) => a + b

  val justDoSomething = () => 3

  println(justDoSomething)
  println(justDoSomething())

  val stringToInt = { str: String =>
    str.toInt
  }

  val niceIncrementer: Int => Int = _ + 1
  val niceAdder: (Int, Int) => Int = _ + _

  val supperAdd = (x: Int) => (y: Int) => x + y
  println(supperAdd(3)(4))

}
