fun TriangleRow(num: Int): Int {

  val result = Math.pow(2.toDouble(),num.toDouble()).toInt()

  return result;
  
}

fun main() {
  println(TriangleRow(readLine()))
}
