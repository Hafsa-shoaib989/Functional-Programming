//In Scala, the Option type is used to represent a value that may or may not exist.

object Task1_3 {
  def DonutCost(Name: String, Quantity: Int, Code: Option[String]): Double ={
    Code match {
      case Some(n) =>
        val discount = 0.1 // Let's simulate a 10% discount
        val totalCost = 2.50 * Quantity * (1 - discount)
        totalCost
      case None => 2.50 * Quantity
    }
  }

  def main(args: Array[String]) = {
    println(s"Total cost without discount by using Option-type = ${DonutCost("Fritter", 2, None)}")
    println(s"Total cost with discount by using Option-type = ${DonutCost("Fritter", 2, Some("coupon_123"))}")
  }
}

