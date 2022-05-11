fun LetterChanges(str: String): String {

  if(str.isNotEmpty()){
    var ch = str[0]
    if(ch in 'a'..'z'){
      ch = if (ch == 'z') 'a' else (ch.toInt() + 1).toChar()
      if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
        ch = Character.toUpperCase(ch)
      }
    }
    return ch.toString() + LetterChanges(str.substring(1, str.length))
  }

  return "";
  
}

fun main() {
  println(LetterChanges(readLine()))
}
