object Task1__1 {
  def quadratric(a: Int, b: Int, c: Int): Int => Int = {
    x => a*x*x + b*x + c
  }
  val a = 3
  val b = 5
  val c = 7

  val y = List.range(-3, 4)
  val z = y.map(quadratric(a, b, c))

  def main(args: Array[String]) = {
    println(s"Mapped List = $z")
  }
}

