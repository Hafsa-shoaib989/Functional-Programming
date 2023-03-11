object Task2_5 {
  def buildMap[A, B](data: Seq[A], f : A => B ): Map[A, B] ={
    data.map(a => (a, f(a))).toMap
  }

  def func(x: Int ): Boolean ={
    if (x % 2 == 0) {
      true
    }else {
      false
    }
  }
  val lst = Array(1 ,2 ,3 ,4, 5, 6)

  def main(args: Array[String]) ={
    println(s"Map using HOF method = ${buildMap(lst, func)}")
  }
}
