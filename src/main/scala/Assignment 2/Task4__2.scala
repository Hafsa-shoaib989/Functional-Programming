object Task4__2 {
  def printStringAddition[A, B](x: A, y: B)(implicit a: A => String, b: B => String): String = {
    val result = a(x) + b(y)
    result
  }

  implicit def intToString(i: Int): String = i.toString

  def main(args: Array[String]): Unit = {
    println(printStringAddition(42, " is the answer."))
  }
}
