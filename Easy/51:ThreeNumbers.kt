fun ThreeNumbers(str: String): Boolean {

  val regOne = """[0-9]{1}[^0-9]*[0-9]{1}[^0-9]+[0-9]{1}""".toRegex()
  val regTwo = """[0-9]{1}[^0-9]+[0-9]{1}[^0-9]*[0-9]{1}""".toRegex()
  val regThree = """[0-9]{1}""".toRegex()

  var array:MutableList<String> = mutableListOf()
  val words = str.split(" ")
  
  for(word in words){
    if(regOne.containsMatchIn(word) == false && regTwo.containsMatchIn(word) == false){
      return false
    }else{
      val matches = regThree.findAll(word).toList()
      array.clear()
      for(match in matches){
        array.add(match.value)
      }
      if(array.distinct().size != 3){
        return false
      }
    }
  }

  return true
  
}

fun main() {
  println(ThreeNumbers(readLine()))
}
