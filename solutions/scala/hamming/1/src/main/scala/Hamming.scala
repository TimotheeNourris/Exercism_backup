object Hamming {
  def distance(dnaStrandOne: String, dnaStrandTwo: String): Option[Int] = {
    if(dnaStrandOne.length != dnaStrandTwo.length) None
    else {
      val charToSpecify = Seq('C', 'A', 'G', 'T')
      val ConcatList = dnaStrandOne.zip(dnaStrandTwo).filter{(c1,c2) => charToSpecify.contains(c1) && charToSpecify.contains(c2)}.count{(c1, c2) => c1 != c2}
      Some(ConcatList)
    }
    
    
  }
}

