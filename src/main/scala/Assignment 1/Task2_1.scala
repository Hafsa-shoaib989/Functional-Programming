import scala.util.Random

object Task2_1 {
  def primeNumbers(n: Int): Boolean = {
    if (n <= 1) {
      false
    } else if (n == 2 || n == 3) {
      true
    } else {
      !(2 to math.sqrt(n).toInt).exists(x => n % x == 0)
    }
  }

  def main(args: Array[String]) = {
    val List1 = List.fill(15)(Random.between(50, 501))
    val p = List1.filter(primeNumbers).sorted
    val primesMap = p.zipWithIndex.map(_.swap).toMap
    println(s"Random prime numbers from range 50 to 500 = ${primesMap}")
  }
}

