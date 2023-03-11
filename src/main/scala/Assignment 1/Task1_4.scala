//A higher-order function (HOF) is often defined as a function that (a) takes other functions as input parameters or (b) returns a function as a result.
object Task1_4 {
  def sayHello(f: () => Unit) = {
    f()
  }
  def helloJoe() ={
    println(s"1st example of HOF = hello joe")
  }

//Another example:
  def executeAndPrint(f: (Int, Int) => Int, i: Int, j: Int) = {
    f(i, j)
  }
  //As these sum and multiply methods match that type signature, they can be passed into executeAndPrint along with two Int values:
  def sum(x: Int, y: Int) ={
    val a = x + y
    a
  }
  def multiply(x: Int, y: Int) ={
    val b = x * y
    b
  }

//Array
  def array(n: Array[Int], f: Int => Int): Array[Int] = {
    n.map(f)
  }
  def square(x: Int): Int = {
    val c = x * x
    c
  }
  val nums = Array(1, 2, 3, 4, 5)

  def main (args: Array[String]) = {
    sayHello(helloJoe)
    println(s"2nd example of HOF sum of two int numbers = ${executeAndPrint(sum, 2, 3)}")
    println(s"2nd example of HOF multiply of two int numbers = ${executeAndPrint(multiply, 3, 3)}")
    println(s"3rd example of HOF square of array numbers = ${array(nums, square).mkString(", ")}")
  }
}
