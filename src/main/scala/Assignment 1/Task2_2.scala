object Task2_2 {
  def CharArray(start: Int): List[Char] ={
    def go(cur: Int, acc: List[Char]): List[Char] ={
      if (cur > 'z') {
        acc.reverse
      }else {
        go(cur + 1, cur.toChar :: acc)
      }
    }
    go(start, List.empty[Char])
  }

  def main(args: Array[String]) ={
    println(s"characters from a to z using tail-recursion method = ${CharArray(97)}")
  }
}
