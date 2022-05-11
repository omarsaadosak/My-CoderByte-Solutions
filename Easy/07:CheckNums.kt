fun CheckNums(num1: Int, num2: Int): String {

  if(num2 > num1){
    return "true"
  }else if(num2 < num1){
    return "false"
  }else{
    return "-1"
  }
  
}

fun main() {
  println(CheckNums(readLine()))
}
