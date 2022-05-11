fun SimpleSymbols(str: String): String {

  val n = str.length
  var next:Char
  var now:Char
  var last:Char
  var result = "true"
  var i = 1

  if(str[0].isLetter() || str[n-1].isLetter()){
    return "false"
  }

  while (i<n-1 && result=="true"){
    now = str[i]
    last = str[i-1]
    next = str[i+1]
    if(now.isLetter() && (last!='+' || next!='+')){
      return "false"
    }
    i++
  }
  
  return result;
  
}

fun main() {
  println(SimpleSymbols(readLine()))
}
