fun PowersofTwo(num: Int): Boolean {
  
  var number = num

  while(number%2 == 0){
    number = number / 2
  }

  if(number == 1){
    return true
  }else{
    return false
  }
  
}

fun main() {
  println(PowersofTwo(readLine()))
}
