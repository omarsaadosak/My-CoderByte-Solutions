fun BitwiseOne(strArr: Array<String>): String {

  val firstRecord = strArr[0]
  val secondRecord = strArr[1]
  var result = ""

  for(i in 0..firstRecord.length-1){
    if(firstRecord[i] == '1' || secondRecord[i] == '1'){
      result += "1"
    }else{
      result += "0"
    }
  }

  return result
  
}

fun main() {
  println(BitwiseOne(readLine()))
}
