object Task2_4 {
  def array1(n: Array[Int]): Array[Int] ={
    if (n.isEmpty) {
      Array()
    }else if (n.head % 2 == 0) {           // use n.head to get the first element of the array
      Array(n.head) ++ array1(n.tail)      // use n.tail to get the rest of the array
    }else {
      array1(n.tail)
    }
  }

  //  2nd method
  def array2(n: Array[Int], f: Int => Int): Array[Int] ={
    n.map(f)
  }
  def Count(x: Int): Int = {
    if (x % 2 == 0) {
      1
    }else {
      0
    }
  }
  val num1 = Array(1,2,3,4,5,6,7,8)

  def main(args: Array[String]) = {
    val a = Array(1,2,3,4,5,6)
    println(s"Even numbers using recursion method = ${array1(a).mkString(", ")}")
    println(s"Count of even numbers using HOF = ${array2(num1, Count).sum}")
  }
}

