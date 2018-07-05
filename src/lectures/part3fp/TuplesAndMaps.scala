package lectures.part3fp

object TuplesAndMaps extends App {

  val aTuple = new Tuple2(200, "Hello, Scala")
  println(aTuple._1)
  println(aTuple._2)
  println(aTuple.copy(_2 = "Good bye, Java!!"))
  println(aTuple.swap)

  val aMap: Map[String, Int] = Map()
  val phoneBook = Map(("Jim", 555), "Daniel" -> 799).withDefaultValue(-1)
  println(phoneBook)
  println(phoneBook.contains("Jim"))
  println(phoneBook("Jim"))
  println(phoneBook("Mary"))
  val pairing = "Mary" -> 678
  val newPhonebook = phoneBook + pairing
  println(newPhonebook)
  println(newPhonebook.map(pair => pair._1.toLowerCase -> pair._2))

  println(newPhonebook.filterKeys(x => x.startsWith("J")))
  println(newPhonebook.filterKeys(_.startsWith("J")))

  println(newPhonebook.mapValues(_ * 100))
  println(newPhonebook.mapValues(n => n + "100"))

  println(newPhonebook.toList)

  val names = List("Angela", "Mary", "Jane", "Jim")
  println(names.groupBy(name => name.charAt(0)))

}