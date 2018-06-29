package lectures.part1basics

import scala.annotation.tailrec

object DefaultArgs extends App {

  @tailrec
  def trFact(n: Int, acc: Int = 1): Int = {
    if (n <= 1) acc
    else trFact(n - 1, acc)
  }

  val fact10 = trFact(n = 10, acc = 2)

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit =
    println("saving picture...")
  savePicture(height = 600, width = 800, format = "bmp")



}