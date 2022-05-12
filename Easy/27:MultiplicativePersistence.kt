fun MultiplicativePersistence(num: Int): Int {

  var i = 0
  var n = num
  var txt: String
  var digitArray: List<Int>

  while(n > 9){
    txt = n.toString()
    digitArray = txt.toCharArray().map {Integer.parseInt(it.toString())}
    n = digitArray.reduce {acc, next -> acc * next }
    i++
  }

  return i;
  
}

fun main() {
  println(MultiplicativePersistence(readLine()))
}
