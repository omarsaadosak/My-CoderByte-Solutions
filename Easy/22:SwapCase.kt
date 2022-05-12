  fun SwapCase(str: String): String {

  var result = ""

  for(ch in str){
    when{
      ch.isLowerCase() -> result += ch.toUpperCase()
      ch.isUpperCase() -> result += ch.toLowerCase()
      else -> result += ch
    }
  }

  return result;
  
}

fun main() {
  println(SwapCase(readLine()))
}
