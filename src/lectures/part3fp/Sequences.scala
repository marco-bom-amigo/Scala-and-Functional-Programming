package lectures.part3fp

object Sequences extends App {
  val aSequence = Seq(10,20,30,40,3,2,1)
  println(aSequence)
  println(aSequence.reverse)
  println(aSequence(2))
  println(aSequence ++ Seq(50,60,70))
  println(aSequence :+ 50)
  println(50 +: aSequence)
  println(aSequence.sorted)

  val aRange: Seq[Int] = 1 to 10
  aRange.foreach(println)
  (1 to 10).map(x => x + 10).foreach(println)
  (1 to 10).foreach(x => println("Hello"))

  val aList = List(1,2,3)
  println(0 :: aList)
  println(0 +: aList :+ 4)

  val apples5 = List.fill(5)("apple")
  println(apples5)
  println()
  println(aList.mkString("-"))

  val numbers = Array(1,2,3,4)
  val threeElements = Array.ofDim[Int](3)
  threeElements.foreach(println)

  numbers(2) = 0

  val numbersSeq: Seq[Int] = numbers

  val vector: Vector[Int] = Vector(1,2,3)

  System.nanoTime()

}