fun WordCount(str: String): Int {

  var words = str.split("\\s+".toRegex()).toTypedArray()

  return words.size
  
}

fun main() {
  println(WordCount(readLine()))
}
