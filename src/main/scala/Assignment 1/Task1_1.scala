//In scala there are many ways to make an array. Some of them are as follows.
object Task1_1 {
  def myArray(n: Int): Array[Int] = {
    val a = Array.tabulate(n)(_+1)
    a
  }
  //Another example
  def myArray1(n: Int): Array[Int] ={
    def go(n: Int, acc: Array[Int]): Array[Int] ={
      if (n == 0) {
        acc
      } else {
        val acc1 = n +: acc
        go(n - 1, acc1)
      }
    }
    go(n, Array.empty[Int])
  }

  def main(args: Array[String]) ={
    println(s"Array from tabulate method = ${myArray(4).mkString(", ")}")
    println(s"Array from tail-recursive method = ${myArray1(4).mkString(", ")}")
  }
}


