//In Scala, implicit conversions can be used to convert values of one type to another type automatically.
object Task4__1 {
  case class Person(name: String, age: Int)

  implicit class PersonToString(val person: Person) extends AnyVal {
    def greet(): String = s"Hello, my name is ${person.name} and I'm ${person.age} years old."
  }

  def printMessage(greeting: String): Unit = {
  }

  val person: Person = Person("Hafsa", 19)
  printMessage(person.greet())

  def main(args: Array[String]) = {
    println(person.greet())
  }
}
