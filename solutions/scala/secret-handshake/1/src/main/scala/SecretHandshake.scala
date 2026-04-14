object SecretHandshake {

  private val actions = List(
    "wink",
    "double blink",
    "close your eyes",
    "jump"
  )

  def commands(number: Int): List[String] = {
    val bits = number.toBinaryString.reverse

    val result =
      bits.zipWithIndex.collect {
        case ('1', i) if i < actions.length => actions(i)
      }.toList

    if (bits.length > 4 && bits(4) == '1') result.reverse
    else result
  }
}