fun ExOh(str: String): String {

  if(str.length % 2 != 0){
    return "false"
  }

  var count = 0

  for(i in 0..str.length-1){
    if(str.get(i).toChar() == 'x'){
      count++
    }else{
      count--
    }
  }

  if(count != 0){
    return "false"
  }else{
    return "true"
  }
  
}

fun main() {
  println(ExOh(readLine()))
}
