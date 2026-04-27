object Sieve {
  // Un nombre est premier si aucun nombre entre 2 et x -1 ne le divise
  def primes(nb: Int) = {
    if (nb == 2) List(nb)
    else if (nb <= 1) List()
    else (2 to nb).filter(x => !(2 to x-1).exists(y => x % y == 0))

  }
}