fun LetterCapitalize(str: String): String {
  var result = ""
  var i = 0
  var n = str.length
  var now : Char
  var previous = 'a'

  while (i < n){
    now = str[i]
    if(i == 0){
      result += now.toUpperCase()
    }else if(previous == ' '){
      result += now.toUpperCase()
    }else{
      result += now
    }
    previous = now
    i++
  }
  return result
}

fun main() {
  println(LetterCapitalize(readLine()))
}
