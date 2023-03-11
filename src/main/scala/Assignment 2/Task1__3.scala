import scala.math.sqrt

object Task1__3 {
  def EuclideanNorm(vector: List[Int]): Double  = {
    val x = vector.map(math.pow(_, 2)).sum
    sqrt(x)
  }

  val l = List(1, 2, 3, 4)

  def main(args: Array[String]) = {
    println(s"Magnitude of a Vector is = ${EuclideanNorm(l)}")
  }
}
