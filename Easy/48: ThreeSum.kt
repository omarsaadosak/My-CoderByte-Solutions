fun ThreeSum(arr: Array<Int>): String {

  if(arr.size < 4)
    return "Should be at least 4 elements in the array"

  val felement = arr[0]
  
  for(i in 1 until arr.size){
    for(j in i + 1 until arr.size){
      for(z in j + 1 until arr.size){
        var sum = arr[i] + arr[j] + arr[z]
        if (sum == felement){
          return "true"
        }
      }
    }
  }

  return "false"
  
}

fun main() {
  println(ThreeSum(readLine()))
}
