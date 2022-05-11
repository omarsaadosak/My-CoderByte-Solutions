fun SimpleAdding(num: Int): Int {

  var result = 0
  for (i in 1..num){
    result += i
  }
  return result;
  
}

fun main() {
  println(SimpleAdding(readLine()))
}
