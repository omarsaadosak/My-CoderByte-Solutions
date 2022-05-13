fun WaveSorting(arr: Array<Int>): Boolean {

  arr.sort()
  val half = arr.size / 2
  for(index in 0 until half){
    if(arr[index] >= arr[index + half]){
      return false
    }
  }

  return true
  
}

fun main() {
  println(WaveSorting(readLine()))
}
