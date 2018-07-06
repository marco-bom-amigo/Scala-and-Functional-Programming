package lectures.part4pm

object AllThePatterns extends App {
  val x: Any = "Scala"
   val matchAnything = x match {
    case _ =>
  }
  val matchAVariable = x match {
    case something => s"I've found $something"
  }
  val aTuple = (1,2)
  val matchTuple = aTuple match {
    case (1, 1) =>
    case (something, 2) => s"I've found $something"
  }
  val nestedTuple = (1, (2,3))
  val matchANestedTuple = nestedTuple match {
    case (_, (2, v)) =>
  }
  val unknown: Any = 2
  val unknownMatch = unknown match {
    case list: List[Int] =>
    case _ =>
  }
  val aInt = 1
  val r = aInt match {
    case 1 | 2 =>
    case 3 =>
  }
}
