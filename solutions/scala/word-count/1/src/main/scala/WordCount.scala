class WordCount(words: String) {
  def countWords =
    words
      .toLowerCase
      .replaceAll("[^a-zA-Z0-9']+", " ")
      .split("\\s+")
      .filter(_.nonEmpty)
      .map(_.replaceAll("^'+|'+$", "")) 
      .filter(_.nonEmpty)
      .groupBy(identity)
      .map { case (word, occurrences) =>
        (word, occurrences.length)
      }
}