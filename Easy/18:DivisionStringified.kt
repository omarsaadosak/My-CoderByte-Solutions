import kotlin.math.roundToInt

fun DivisionStringified(num1: Int, num2: Int): String {

  val devided = num1.toFloat() / num2.toFloat()
  val result = String.format("%,d",devided.roundToInt())

  return result
  
}

fun main() {
  println(DivisionStringified(readLine()))
}
