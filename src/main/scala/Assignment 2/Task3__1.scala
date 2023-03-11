object Task3__1 {
  val lst = List(1, 2, 3, 4, 5)
  val a = (lst.apply(0) to lst.apply(lst.length - 1)).toList

  def main(args: Array[String]) = {
    println(s"list with apply function = $a")
  }
}
