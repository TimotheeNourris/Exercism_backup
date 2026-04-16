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

/*
// 1ere étape transformer le mot en une liste
// word.toUpperCase.toList : "AEER" → List('A','E','E','R')

// On se met ensuite à la maille de chaque caractere (element de la liste)
// .map { char => ... } : Char → Int (score)

// On trouve le score avec find (exemple pour A la premiere lettre)
// letterWithScore.find { case (score, letters) => letters.contains(char) } : Some((1, "AEIOULNRST")) 

// On Extrait le score avec map
//.map { case (score, _) => score } : Some((1, "...")) → Some(1) 

// On gère le cas des None avec getOrElse()
//.getOrElse(0) : transforme Some(1) → 1 et None → 0

// La derniere map résulte dans un List[Int], il ne nous reste plus qu'a faire sum pour additionner // le tout
*/