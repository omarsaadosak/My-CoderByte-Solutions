
fun ABCheck(str: String): String {

  val regex1 = Regex("a.{3}b")
  val regex2 = Regex("b.{3}a")
  var match1 = regex1.find(str)
  var match2 = regex2.find(str)
  if(match1 != null || match2 != null){
    return "true"
  }else{
    return "false"
  }
  
}

fun main() {
  println(ABCheck(readLine()))
}
