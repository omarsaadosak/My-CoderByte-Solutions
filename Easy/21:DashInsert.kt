fun DashInsert(str: String): String {

  var i = 0
  var result = ""
  var now: Int
  var next: Int

  while(i < str.length -1){
    now = Integer.parseInt(str[i].toString())
    next = Integer.parseInt(str[i+1].toString())
    result += str[i]
    if(now%2 != 0 && next%2 != 0){
      result += "-"
    }
    i++
  }

  result += str[i]

  return result;
  
}

fun main() {
  println(DashInsert(readLine()))
}
