fun ThirdGreatest(strArr: Array<String>): String {

  var result = ""
  val lengths = ArrayList<Int>()

  for(item in strArr){
    //println(item.length)
    lengths.add(item.length)
  }

  lengths.sort()
  lengths.reverse()
  //println(lengths)
  val thirdLongestItem = lengths[2]

  for(item in strArr){
    if(item.length == thirdLongestItem){
      result = item
    }
  }

  return result;
  
}

fun main() {
  println(ThirdGreatest(readLine()))
}
