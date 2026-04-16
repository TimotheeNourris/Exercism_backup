object ScrabbleScore {
  val letterWithScore = Map(
    1 -> "AEIOULNRST", 
    2 -> "DG", 
    3 -> "BCMP", 
    4 -> "FHVWY", 
    5 -> "K",
    8 -> "JX",
    10 -> "QZ"
  )

  def score(word: String): Int = {
    word
      .toUpperCase
      .toList
      .map { char =>
        letterWithScore
          .find { case (score, letters) => letters.contains(char) }
          .map { case (score, _) => score }
          .getOrElse(0)
      }
      .sum
  }
}