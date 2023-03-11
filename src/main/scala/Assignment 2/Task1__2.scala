object Task1__2 {
  val l1 = List(-3, -2, -1, 0, 1, 2, 3)
  val l2 = List(19, 9, 5, 7, 15, 29, 49)

  val zl = l1.zip(l2)

  val triplets = zl.zipWithIndex.map {
    case ((x, fx), index) => (x, fx, index)
  }

  val meanValue = triplets.map(_._2).sum / triplets.length

  val mean = triplets.find(_._2 == meanValue)

  def main(args: Array[String]) = {
    println(s"Zipped List = $zl")
    println(s"Three elements List = $triplets")
    println(s"Mean value of f(x) is = $meanValue")
    println(s"Mean is = $mean")
  }
}
