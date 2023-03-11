object Task2__3 {
//11.2
  //seq
  val a = Seq(1, 2, 3, 4, 5)
  val seqDoubled = a.map(_ * 2)
  val seqSquared = a.flatMap(x => Seq(x, x * x))

  //set
  val b = collection.SortedSet(1, 2, 3, 4, 5)
  val setDoubled = b.map(_ * 2)
  val setSquared = b.flatMap(x => collection.SortedSet(x, x * x))

  //Map
  val c = collection.SortedMap("a" -> 1, "b" -> 2, "c" -> 3)
  val mapDoubled = c.view.mapValues(_ * 2).toMap
  val mapSquared = c.view.flatMap { case (k, v) => collection.SortedMap(k -> v, k + k -> v * v) }.toMap

  //list
  val d = List(1, 2, 3, 4, 5)
  val listDoubled = d.map(_ * 2)
  val listSquared = d.flatMap(x => List(x, x * x))

//11.3
  //seq
  val e: Seq[Int] = Seq(1, 2, 3, 4, 5)
  val seqMap = e.map(_ + 1) // Returns Seq(2, 3, 4, 5, 6)
  val seqFlatMap = e.flatMap(i => Seq(i, i * 2)) // Returns Seq(1, 2, 2, 4, 3, 6, 4, 8, 5, 10)

  //set
  val f: scala.collection.SortedSet[Int] = collection.SortedSet(1, 2, 3, 4, 5)
  val setMap = f.map(_ + 1) // Returns Set(2, 3, 4, 5, 6)
  val setFlatMap = f.flatMap(i => Set(i, i * 2)) // Returns Set(1, 2, 4, 3, 6, 5, 10)

  //Map
  val g: scala.collection.SortedMap[String, Int] = collection.SortedMap("a" -> 1, "b" -> 2, "c" -> 3)
  val mapMap = g.map { case (k, v) => (k, v + 1) }.toMap // Returns Map("a" -> 2, "b" -> 3, "c" -> 4)
  val mapFlatMap = g.flatMap { case (k, v) => Seq((k, v.toString)) }.toMap // Returns Map("a" -> "1", "b" -> "2", "c" -> "3")

//11.4
  //set
  val h: scala.collection.Set[Int] = Set(1, 2, 3, 4, 5)
  val uSet_selective = h.map(x => f(x))
  val uSet_selective_flatMap = h.flatMap(x => List(f(x)))

//11.5
  //list
  val i = List(1, 2, 3, 4, 5)
  val newList = i.map(x => x * 2)
  val flatList = i.flatMap(x => List(x, x * 2))

  //set
  val j = collection.SortedSet(1, 2, 3, 4, 5)
  val newSet = j.map(x => x * 2)
  val flatSet = j.flatMap(x => collection.SortedSet(x, x * 2))

  //seq
  val k = Seq(1, 2, 3, 4, 5)
  val newSeq = k.map(x => x * 2)
  val flatSeq = k.flatMap(x => Seq(x, x * 2))


  def main(args: Array[String]) = {
    println(s"Map in seq is = $seqDoubled")
    println(s"FlatMap in seq is = $seqSquared")
    println(s"Map in Set is = $setDoubled")
    println(s"FlatMap in Set is = $setSquared")
    println(s"Map in Map is = $mapDoubled")
    println(s"FlatMap in Map is = $mapSquared")
    println(s"Map in list is = $listDoubled")
    println(s"FlatMap in list is = $listSquared")
    println()
    println(s"Map in seq is = $seqMap")
    println(s"FlatMap in seq is = $seqFlatMap")
    println(s"Map in set is = $setMap")
    println(s"FlatMap in set is = $setFlatMap")
    println(s"Map in map is = $mapMap")
    println(s"FlatMap in map is = $mapFlatMap")
    println()
    println(s"Map in Set is = $uSet_selective")
    println(s"flatMap in set is = $uSet_selective_flatMap")
    println()
    println(s"Map in list is = $newList")
    println(s"flatMap in list is = $flatList")
    println(s"Map in set is = $newSet")
    println(s"flatMap in set is = $flatSet")
    println(s"Map in seq is = $newSeq")
    println(s"flatMap in seq is = $flatSeq")
  }
}
