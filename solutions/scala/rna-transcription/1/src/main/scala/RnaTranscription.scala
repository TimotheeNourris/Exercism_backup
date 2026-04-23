object RnaTranscription {
  def toRna(sequence: String): Option[String] = {
    val equivalence = Map(
      "G" -> "C",
      "C" -> "G",
      "T" -> "A",
      "A" -> "U"
    )
    Some(sequence.toList.map{ x => equivalence.get(x.toString).getOrElse(x) }.mkString)
/*    sequence.toList.map{ x => if(equivalence.contains(x.toString)) equivalence(x.toString); else x.toString}*/
  }
  
}
