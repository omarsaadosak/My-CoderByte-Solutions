fun ScaleBalancing(strArr: Array<String>): String {

  val scale = strArr[0].replace(" ","").trim{it=='[' || it==']'}.split(",")
  val weights = strArr[1].replace(" ","").trim{it=='[' || it==']'}.split(",")

  var result = ""
  val size = weights.size
  var small:Int
  var big:Int
  var now:Int
  var weightsTemp:MutableList<String>

  if(Integer.parseInt(scale[0]) < Integer.parseInt(scale[1])){
    small = Integer.parseInt(scale[0])
    big = Integer.parseInt(scale[1])
  }else{
    big = Integer.parseInt(scale[0])
    small = Integer.parseInt(scale[1])
  }
  
  var i = 0
  while(i<size){
    now = Integer.parseInt(weights[i])
    if(small + now == big){
      result = weights[i]
      break
    }else if(result == ""){
      weightsTemp = weights.toMutableList()
      weightsTemp.remove(weights[i])
      if(Math.abs(small + now - big).toString() in weightsTemp){
        result = weights[i] + "," + Math.abs(small+now-big).toString()
      }else if(Math.abs(big + now - small).toString() in weightsTemp){
        result = weights[i] + "," + Math.abs(big+now-small).toString()
      }
    }
    i++
  }

  if(result == ""){
    result = "not possible"
  }

  return result
  
}

fun main() {
  println(ScaleBalancing(readLine()))
}
