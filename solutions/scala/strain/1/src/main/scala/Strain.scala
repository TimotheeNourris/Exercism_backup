object Strain {
  def keep[A](a: Seq[A], f: A => Boolean) = a.filter(f)
  def discard[A](a: Seq[A], f: A => Boolean) = a.filter(x => !f(x))
} 