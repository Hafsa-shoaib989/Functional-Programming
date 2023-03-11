object Task2_3 {
  def ArraySum(a: Array[Double], b: Array[Double]): Array[Double] ={
    a.zip(b).map {
      case (a, b) =>
        a + b
    }
  }

  def main(args: Array[String]) ={
    val x = Array(1.0, 2.0, 3.0)
    val y = Array(4.0, 5.0, 6.0)
    println(s"Sum of two arrays = ${ArraySum(x, y).mkString(", ")}")
  }
}

