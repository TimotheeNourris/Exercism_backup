object CollatzConjecture {
  def steps(nb: Int): Option[Int] = {
    if(nb <= 0) None
    else if (nb == 1) Some(0)
    else if (nb %2 == 0) steps(nb/2).map(_ +1)
    // On rajoute 1 a chaque fois qu'on fait une étape
    else steps(nb*3 +1).map(_ +1)
  }
                                                              
}