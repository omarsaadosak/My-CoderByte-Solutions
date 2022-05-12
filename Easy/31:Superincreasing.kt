fun Superincreasing(arr: Array<Int>): Boolean {

  var sum = 0
  for(number in arr){
    if(number <= sum){
      return false
    }else{
      sum += number
    }
  }

  return true
  
}

fun main() {
  println(Superincreasing(readLine()))
}
