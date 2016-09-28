package exercises

object Palindrome {
  /** 
   *  True if the string is a palindrome, after removing all non-alphabetic 
   *  characters (e.g., spaces, numbers, and punctuation).
   *  
   *  Hint: the Scala collections API is your friend
   *  http://docs.scala-lang.org/overviews/collections/overview.html 
   */
  def isPalindrome(s: String): Boolean = {
   	//filter out the non-letter characters
  	val letters = s.filter(a => a.isLetter)
  	// make all the letters lowercase
  	val lowercase = letters.toLowerCase()

  	isPalindromeHelper(lowercase)
  }

  /**
  * Given a string of lowercase letters, ensures that it is a palindrome
  */
  def isPalindromeHelper(s: String): Boolean = {
  	if (s.length <= 1) true
  	else
  	// ensure that the first and last are the same, recurse on the inside
  		(s(s.length - 1) == s(0)) && 
  		(isPalindromeHelper(s.substring(1, s.length - 1)))
  }
}

