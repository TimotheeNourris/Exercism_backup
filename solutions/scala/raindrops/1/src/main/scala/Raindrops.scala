object Raindrops {
  val sounds = List(
      (3, "Pling"),
      (5, "Plang"),
      (7, "Plong")
    )
  def convert(n: Int): String = {
   val result =  sounds
      .filter{case (divisor, _) => n%divisor == 0}
      .map{case (_, song) => song}
      .mkString
    if(!(result.isEmpty)) result
    else n.toString
}
}
