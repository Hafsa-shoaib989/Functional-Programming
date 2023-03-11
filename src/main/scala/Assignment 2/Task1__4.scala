object Task1__4 {
// 11.2
  // An example list
  val uList = List(1, 2, 3, 4, 5)

  // map method applied to List
  val uList_Twice = uList.map(_ * 2)

  // Applying map to List using user-defined method
  def f(x: Int) = if (x > 2) Some(x * x) else None
  val uList_Squared = uList.flatMap(f)

// 11.3
  // An example list
  val uList1: List[Int] = List(1, 2, 3, 4, 5)

  def g(v: Int) = List(v - 1, v, v + 1)

  val uList_Extended = uList1.map(g(_))
  val uList_Extended_flatmap = uList1.flatMap(g(_))

// 11.4
  // An example list
  val ulist2: List[Int] = List(1, 2, 3, 4, 5)

  // Applying map and flatMap to List with built-in Options class
  def h(y: Int) = if (y > 2) Some(y) else None

  val ulist_selective = ulist2.map(f(_))
  val ulist_selective_flatMap = ulist2.flatMap(f(_))

// 11.5
  // An example Map using (key, value) pairs
  val uMap = Map('a' -> 2, 'b' -> 4, 'c' -> 6)

  // Applying mapValues to Map
  val uMap_mapValues = uMap.view.mapValues(_ * 2)

  def h(k: Int, v: Int) = Some(k -> v * 2)

  // Applying map to Map
  val uMap_map = uMap.map {
    case (k, v) => h(k, v)
  }

  // Applying flatMap to Map
  val uMap_flatMap = uMap.flatMap {
    case (k, v) => h(k, v)
  }

  def main(args: Array[String]) = {
    println(s"List elements doubled: $uList_Twice")
    println(s"List elements squared selectively: $uList_Squared")
    println()
    println(s"Extended list using map: $uList_Extended")
    println(s"Extended list using flatMap: $uList_Extended_flatmap")
    println()
    println(s"Selective elements of List with map: $ulist_selective")
    println(s"Selective elements of List with flatMap: $ulist_selective_flatMap")
    println()
    println(s"Map values doubled using mapValues: $uMap_mapValues")
    println(s"Map values doubled using map: $uMap_map")
    println(s"Map values doubled using flatMap: $uMap_flatMap")
  }
}
