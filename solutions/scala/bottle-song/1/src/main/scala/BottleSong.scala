object BottleSong {
  def recite(startBottles: Int, takeDown: Int): String = {
    val mappingFromNb: Map[Int, String] = Map(
      1 -> "One", 2 -> "Two", 3 -> "Three", 4 -> "Four",
      5 -> "Five", 6 -> "Six", 7 -> "Seven", 8 -> "Eight",
      9 -> "Nine", 10 -> "Ten"
    )

    (startBottles until (startBottles - takeDown) by -1).map { i =>
      val bottleCorrect = if (i == 1) "bottle" else "bottles"

      val nextWord =
        if (i == 1) "no"
        else mappingFromNb(i - 1).toLowerCase

      val nextBottleCorrect =
        if (i - 1 == 1) "bottle"
        else "bottles"

      s"""${mappingFromNb(i)} green $bottleCorrect hanging on the wall,
${mappingFromNb(i)} green $bottleCorrect hanging on the wall,
And if one green bottle should accidentally fall,
There'll be $nextWord green $nextBottleCorrect hanging on the wall."""
    }.mkString("\n\n") + "\n"
  }
}