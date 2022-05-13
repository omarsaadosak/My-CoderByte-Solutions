fun TwoSum(arr: Array<Int>): String {

  var result = ""
  val sum = arr[0]
  var remainder:Int

  for(i in 1..arr.size - 1){
      var tempArr = removeAt(arr,i+1)
      remainder = sum - arr[i]
      //println(remainder)
      if(tempArr.contains(remainder)){
        //if(arr.indexOf(remainder) > i){
          result = result + arr[i] + "," + remainder + " "
        //}
      }
  }

  if(result == "") return "-1" else return result.dropLast(1)
  
}

fun removeAt(arr: Array<Int>, index: Int): Array<Int>{
  var p = 0
  val sizeNew = arr.size - index
  var newArray = Array(sizeNew){0}
  //println("${sizeNew} index ${index}")
  for(i in index..arr.size-1){
      newArray.set(p,arr[i])
      //print(newArray[p])
      p++
  }
  //println("")
  return newArray
}

fun main() {
  println(TwoSum(readLine()))
}
