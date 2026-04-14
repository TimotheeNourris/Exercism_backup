object ReverseString {
  def reverse(str: String): String = {
    // Avec un val (mieux)
    //val f = (acc : List[Char], c: Char) => c :: acc
    (str.foldLeft(List[Char]())((acc : List[Char], c: Char) => c :: acc)).mkString
    
    // Avec un var
    /*
    var finalList: List[Char] = List()
    for (c <- str) {
      finalList = c :: finalList
    }
    finalList.mkString
    */
  }
}
