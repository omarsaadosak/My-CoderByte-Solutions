fun NonrepeatingCharacter(str: String): String {

  val input = str
  var tempStr: String
  for(i in 0..input.length-1){
    tempStr = input.substring(0,i).plus("").plus(input.substring(i+1))
    //println(tempStr)
    //println(input[i])
    if(!tempStr.contains(input[i])){
      return input[i].toString()
    }
  }
  
  return "NULL"
}

fun main() {
  println(NonrepeatingCharacter(readLine()))
}
