fun PowerSetCount(arr: Array<Int>): Int {

  return Math.pow(2.toDouble(), arr.size.toDouble()).toInt()
  
}

fun main() {
  println(PowerSetCount(readLine()))
}
