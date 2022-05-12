fun ChangingSequence(arr: Array<Int>): Int {

  var diff: Int
  var trend: Int = 0
  var i = 0

  while(i < arr.size - 1){
    diff = arr[i] - arr[i+1]
    diff = diff / Math.abs(diff)
    if(diff * trend == -1){
      break
    }
    trend = diff
    i++
  }

  if(i == arr.size-1)
    return -1
  else
    return i
  
}

fun main() {
  println(ChangingSequence(readLine()))
}
