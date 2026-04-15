object Grains {
  def square(nb: Int): Option[BigInt] = {
    if(nb == 1) Some(1)
    else if (nb < 0 || nb > 64) None
    else square(nb-1).map(_ * 2)
  }
  val total: BigInt = (1 to 64).flatMap(x => square(x)).sum

}