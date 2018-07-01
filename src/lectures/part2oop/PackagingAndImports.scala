package lectures.part2oop

// import playground._
import playground.{PrinceCharming, Cinderella => Princess}
import java.util.Date
import java.sql.{Date => SqlDate}

object PackagingAndImports extends App {

  val writer: Writer = new Writer(firstName = "M. Bonamichi", surname = "Rock Scala", year = 2018)

  //val princess = new playground.Cinderella
  val princess = new Princess
  val prince = new PrinceCharming

  sayHello

  val date = new Date
  val sqlDate = new SqlDate(2018, 5, 4)

}