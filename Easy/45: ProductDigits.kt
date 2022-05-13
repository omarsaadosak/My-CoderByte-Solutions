fun ProductDigits(num: Int): Int {

  var i = 9
  var result = 0
  var division : Int

  while(i > 0 && result == 0){
    if(num % i == 0){
      division = num / i
      result = i.toString().length + division.toString().length
    }
    i--
  }
  
  return result
}

fun main() {
  println(ProductDigits(readLine()))
}
