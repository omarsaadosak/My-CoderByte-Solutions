fun ArrayMatching(strArr: Array<String>): String {

  var array1 = strArr[0].replace("\\[|\\s|\\]".toRegex(),"").split(",")
  var array2 = strArr[1].replace("\\[|\\s|\\]".toRegex(),"").split(",")
  
  var result = ""
  var maxSize = Math.max(array1.size,array2.size)

  for(i in 0 until maxSize){
    if(i < array1.size && i < array2.size){
      result = result + (Integer.parseInt(array1[i]) + Integer.parseInt(array2[i])).toString() + "-"
    }else if(i < array1.size){
      result = result + (Integer.parseInt(array1[i])).toString() + "-"
    }else{
      result = result + (Integer.parseInt(array2[i])).toString() + "-"
    }
  }
  
  return result.dropLast(1)
}

fun main() {
  println(ArrayMatching(readLine()))
}
