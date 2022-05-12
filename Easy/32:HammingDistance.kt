fun HammingDistance(strArr: Array<String>): Int {

  var count = 0

  for(i in 0..strArr[0].length-1){
    if(strArr[0][i] != strArr[1][i]){
      count++
    }
  }

  return count
  
}

fun main() {
  println(HammingDistance(readLine()))
}
