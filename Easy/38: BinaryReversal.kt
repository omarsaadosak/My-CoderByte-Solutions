fun BinaryReversal(str: String): Int {

  var txt = Integer.toBinaryString(Integer.parseInt(str))
  //println(txt)
  val n : Int = (txt.length - 1) / 8+1
  txt = txt.padStart(n*8,'0')
  //println(txt)
  txt = txt.reversed()
  //println(txt)

  return Integer.parseInt(txt,2)
  
}

fun main() {
  println(BinaryReversal(readLine()))
}
