fun LetterCountI(str: String): String {

  val words = str.split("\\s+".toRegex()).toTypedArray()
  var transform: (String) -> Int = {countRepeatsLetter(it)}
  
  var countArray = words.map(transform)
  val maxIndex : Int
  var result:String
  if(countArray.max() != 1){
    maxIndex = countArray.indexOf(countArray.max())
    result = words[maxIndex]
  }else{
    result = "-1"
  }

  return result
  
}

fun countRepeatsLetter(word: String): Int{
  var map = mutableMapOf<Char, Int>()
  var v:Int
  for(c in word){
    if(c in map.keys){
      v = map[c] ?:0
      map.put(c,v+1)
    }else{
      map.put(c,1)
    }
  }
  return map.values.max() ?:0
}

fun main() {
  println(LetterCountI(readLine()))
}
