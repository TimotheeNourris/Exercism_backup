object HighScores {
  def latest(listeScore: List[Int]): Int = listeScore.last
  def personalBest(listeScore: List[Int]): Int = listeScore.max
  def personalTop(listeScore: List[Int]): List[Int] = listeScore.sorted.reverse.take(3)
  def report(listeScore: List[Int]): String = {
    val maxScore = listeScore.max
    val lastScore = listeScore.last
    if(maxScore == lastScore) s"Your latest score was ${lastScore}. That's your personal best!"
    else s"Your latest score was ${lastScore}. That's ${maxScore - lastScore} short of your personal best!"
  }
}