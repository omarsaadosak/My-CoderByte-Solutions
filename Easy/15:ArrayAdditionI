fun ArrayAdditionI(arr: Array<Int>): Boolean {

  if(arr.size < 2){
    return false
  }

  val numbers = arr.toList().sortedDescending()
  //println(numbers)
  val highest = numbers.first()
  val sum = numbers.drop(1).sum()
  //println(highest)
  //println(sum)
  return highest <= sum
  
}

fun main() {
  println(ArrayAdditionI(readLine()))
}
