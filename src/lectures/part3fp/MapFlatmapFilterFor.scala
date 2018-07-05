package lectures.part3fp

object MapFlatmapFilterFor extends App {
  val list = List(1,2,3)
  println(list)
  println(list.head)
  println(list.tail)
  println(list.filter(_ % 2 == 0))
  val toPair = (x: Int) => List(x, x + 1, x + 2)
  println(list.flatMap(toPair))
  val numbers = List(1,2,3,4)
  val characters = List('a','b','c','d')
  val colors = List("black", "white")
  val combinations = numbers.filter(n => n % 2 ==0).flatMap(n => characters.flatMap(c => colors.map(color => "" + c + n + "-" + color)))
  println(combinations)
  list.foreach(println)
  val forCombination = for {
    n <- numbers if n% 2 == 0
    c <- characters
    color <- colors
  } yield "" + c + n + "-" + color
  println(forCombination)
  for {
    n <- numbers
  } println(n)
  list.map { x =>
    x * 2
  }
  println()
}
