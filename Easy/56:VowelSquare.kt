fun VowelSquare(strArr: Array<String>): String {

  val vowels = "aeiou"
  for(i in 0..strArr.size-2){
    for(j in 0..strArr[i].length-2){
      if( strArr[i][j] in vowels && strArr[i][j+1] in vowels &&
          strArr[i+1][j] in vowels && strArr[i+1][j+1] in vowels)
      {
        return i.toString()+"-"+j.toString()
      }
    }
  }
  return "not found";
  
}

fun main() {
  println(VowelSquare(readLine()))
}
