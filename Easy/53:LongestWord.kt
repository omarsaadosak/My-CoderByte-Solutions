fun LongestWord(sen: String): String {

  val words = """[^a-zA-Z0-9\s]""".toRegex().replace(sen,"").split(" ")

  var longestWord = words[0]

  for(word in words){
    if(word.length > longestWord.length){
      longestWord = word
    }
  }

  return longestWord;
  
}

fun main() {
  println(LongestWord(readLine()))
}
