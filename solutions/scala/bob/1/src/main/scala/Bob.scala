object Bob {
  def response(statement: String): String = {
    // Removing useless space before and after String
    def s = statement.trim

    // Defining our cases 
    val isLetter = s.exists(c => c.isLetter)
    // Finishing with a "?"
    val isQuestionning = s.endsWith("?") 
    // All letters in capital,
    val isYelling = isLetter && s.forall(c => c.isUpper || !c.isLetter)
    val isSilent = s.isEmpty
    

    if(isSilent) "Fine. Be that way!"
    else if(isYelling && isQuestionning) "Calm down, I know what I'm doing!"
    else if(isYelling) "Whoa, chill out!"
    else if(isQuestionning) "Sure."
    else "Whatever."
  }  
}