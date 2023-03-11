import scala.collection.mutable

object Task1_2 {
  def set1(): mutable.Set[Int] ={
    val a = mutable.Set(1,2,3,4,5)
    a
  }

  def map1(): mutable.Map[String, Int] ={
    val b = mutable.Map("x" -> 1, "y" -> 2, "z" -> 3)
    b
  }

  def main(args: Array[String]) = {
    println(s"Mutable Set = ${set1()}")
    println(s"Mutable Map = ${map1()}")
  }
}
