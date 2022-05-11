fun VowelCount(str: String): Int {

  var count = 0
  val vowels = "aeiou"
  for(ch in str){
    if(ch in vowels){
      count++
    }
  }
  return count
}

fun main() {
  println(VowelCount(readLine()))
}
