object ArmstrongNumbers {
  def isArmstrongNumber(nb: Int): Boolean = {
    val lenNb = nb.toString.length
    val listNb = (nb.toString.toList)
    val finalResult = listNb.map((x: Char) => (Math.pow(x.asDigit, lenNb)).toInt).sum
    nb == finalResult
  }
}