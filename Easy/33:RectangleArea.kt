fun RectangleArea(strArr: Array<String>): String {

  var length:Int = 0
  var width: Int = 0

  var lastX: Int ?= null
  var lastY: Int ?= null

  for(str in strArr){
    val point = str.split(" ")

    val x = Integer.valueOf(point[0].substring(1))
    val y = Integer.valueOf(point[1].substring(0,point[1].length-1))

    if(lastX == null){
      lastX = x
    }else{
      length = Math.max(length, Math.abs(lastX - x))
    }

    if(lastY == null){
      lastY = y
    }else{
      width = Math.max(width, Math.abs(lastY - y))
    }
  }

  return (length*width).toString()
  
}

fun main() {
  println(RectangleArea(readLine()))
}
