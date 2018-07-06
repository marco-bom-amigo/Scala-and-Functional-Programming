package lectures.part4pm

object PatternsEverywhere extends App {
  try {
    //
  } catch {
    case e: RuntimeException => "Runtime"
    case npe: NullPointerException => "Nullpointer"
    case _ => ""
  }
  val (a, b, c) = (1, 2, 3)
  val d :: e = List(1, 2, 3)
  val list = List(1,2,3)
  val mappedList = list.map {
      x => x match {
      case v if v % 2 == 0 => v + " is even"
      case 1 => "the one"
      case _ => "somethng else"
    }
  }
  println(mappedList)
}
