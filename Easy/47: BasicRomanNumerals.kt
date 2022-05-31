fun BasicRomanNumerals(str: String): String {

  val romansMap: MutableMap<Char, Int> = HashMap()
  romansMap['I'] = 1
  romansMap['V'] = 5
  romansMap['X'] = 10
  romansMap['L'] = 50
  romansMap['C'] = 100
  romansMap['D'] = 500
  romansMap['M'] = 1000

  val input = str.toCharArray()
  
  val size = input.size
  var result = romansMap[input[size - 1]]!!

  for(i in 0 until size - 1){
    if(romansMap[input[i]]!! < romansMap[input[i+1]]!!){
      result -= romansMap[input[i]]!!
    }else{
      result += romansMap[input[i]]!!
    }
  }

  return result.toString()
  
}

fun main() {
  println(BasicRomanNumerals(readLine()))
}
