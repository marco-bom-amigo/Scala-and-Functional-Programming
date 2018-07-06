package lectures.part3fp

import scala.util.{Failure, Success, Try}

object HandlingFailure extends App {
  val aSuccess = Success(3)
  val aFailure = Failure(new RuntimeException("NUCLER WAR"))
  println(aSuccess)
  println(aFailure)

  def unsafeMethod(): String = throw new RuntimeException("BIG MISTAKE")
  val potentialFailure = Try(unsafeMethod())
  println(potentialFailure)

  val anotherPotentialFailure = Try {

  }
  println(potentialFailure.isSuccess)

  def backupMethod(): String = "A valid string"
  val fallBackTty = Try(unsafeMethod()) orElse Try(backupMethod())
  println(fallBackTty)

  def betterUnsafeMethod(): Try[String] = Failure(new RuntimeException)
  def betterBackupMethod(): Try[String] = Success("A valid result")
  val betterFallBack = betterUnsafeMethod() orElse betterBackupMethod()
  println(aSuccess.map(_ * 2))
  println(aSuccess.flatMap(x => Success(x * 10)))
  println(aSuccess.filter(_ > 10))

}