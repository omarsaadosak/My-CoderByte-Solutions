fun CorrectPath(str: String): String {

  val size = str.length

  var result = StringBuilder()

  var list = str.toCharArray()
  
  var q = size - str.replace("?","").length
  val r = size - str.replace("r","").length
  val l = size - str.replace("l","").length
  val u = size - str.replace("u","").length
  val d = size - str.replace("d","").length

  /*println("-r-" + r)
  println("-l-" + l)
  println("-u-" + u)
  println("-d-" + d)*/

  var y = r - l
  var x = d - u

  for (ch in list){
    if(ch == '?'){
      if(x<4){
        result.append("d")
        x++
        q--
      }else if(y<4){
        result.append("r")
        y++
        q--
      }else if(x>4){
        result.append("u")
        x--
        q--
      }else if(y>4){
        result.append("l")
        y--
        q--
      }else if(q<4){
        if(d>r){
          result.append("u")
          x--
        }else{
          result.append("l")
          y--
        }
        q--
      }
    }else{
      result.append(ch)
    }
    //println(result.toString() + "-x-" + x + "-y-" + y + "-q-" + q)
  }

  return result.toString()

}

fun main() {
  println(CorrectPath(readLine()))
}
