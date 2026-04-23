object Isogram {
  def isIsogram(text: String): Boolean = {
    // text.groupBy(x => x) va renvoyer un Map[char, String]
    // val getMappingChar = text.filter(x => x != '-').groupBy(x => x.toUpper).map(x => (x._1, x._2.length))
    val getMappingChar = text.filter(x => x.isLetter).groupBy(x => x.toUpper).map{case (char, occurence) => (char, occurence.length)}

    val lengthMap = getMappingChar.filter{case (x, y) => y > 1}
    lengthMap.isEmpty
  }
}