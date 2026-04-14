object Etl {
  def transform(scoreMap: Map[Int, Seq[String]]): Map[String, Int] = {
    scoreMap
    .flatMap { case (pos, letters) =>
      // ici, letters: Seq[String], pos: Int
      // pour chaque letters, créer une paire (letters, pos)
      letters.map(letters => (letters.toLowerCase(), pos))
    }.toMap
  }
}
