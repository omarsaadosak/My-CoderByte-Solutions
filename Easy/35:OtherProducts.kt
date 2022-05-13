fun OtherProducts(arr: Array<Int>): String {

  if(arr.size < 1 || arr.size > 10)
    return "size of array must be between 1 and 10"

  val product = arr.reduce {pro, index -> pro * index}
  var result = ""
  for(num in arr){
    result = result + (product/num).toString() + "-"
  }

  return result.dropLast(1)
  
}

fun main() {
  println(OtherProducts(readLine()))
}
