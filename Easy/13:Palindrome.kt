fun Palindrome(str: String): String {

  var origin = str.replace("\\s".toRegex(),"")
  var reversed = origin.reversed()
  
  return if (origin == reversed) "true" else "false"
  
}

fun main() {
  println(Palindrome(readLine()))
}
