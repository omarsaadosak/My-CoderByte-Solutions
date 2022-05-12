fun AdditivePersistence(num: Int): Int {

  var i = 0
  var n = num
  var txt = n.toString().toCharArray()
  var digitArray = txt.map {Integer.parseInt(it.toString())}

  while(n > 9){
    n = digitArray.reduce {acc, next -> acc + next}
    txt = n.toString().toCharArray()
    digitArray = txt.map {Integer.parseInt(it.toString())}
    i++
  }

  return i;
  
}

fun main() {
  println(AdditivePersistence(readLine()))
}
