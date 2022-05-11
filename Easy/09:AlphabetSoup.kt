fun AlphabetSoup(str: String): String {

  var array = str.toCharArray()
  array.sort()

  return String(array)
  
}

fun main() {
  println(AlphabetSoup(readLine()))
}
