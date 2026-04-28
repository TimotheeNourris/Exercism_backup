object DifferenceOfSquares {

  def sumOfSquares(n: Int): Int = (1 to n).map(x => x * x).sum

  def squareOfSum(n: Int): Int = {
    val result = (1 to n).reduce(_+_)
    result * result
}
  def differenceOfSquares(n: Int): Int = squareOfSum(n) - sumOfSquares(n)
}
