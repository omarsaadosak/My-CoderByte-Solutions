fun OverlappingRanges(arr: Array<Int>): Boolean {

  var count = 0

  for(i in arr[0]..arr[1]){
    for(j in arr[2]..arr[3]){
      if(i == j){
        count++
      }
    }
  }

  return if(count >= arr[4]) true else false
  
}

fun main() {
  println(OverlappingRanges(readLine()))
}
