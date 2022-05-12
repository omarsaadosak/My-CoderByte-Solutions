fun MeanMode(arr: Array<Int>): Int {

  val mean = getMean(arr)
  val mode = getMode(arr)

  if(mean == mode){
    return 1
  }else{
    return 0
  }
}

fun getMean(arr: Array<Int>): Int{
  return arr.average().toInt()
}

fun getMode(arr: Array<Int>): Int{
  val map: MutableMap<Int,Int> = arr.associate({it to 0}).toMutableMap()
  var temp: Int
  var maxKey: Int = 0
  var max: Int = 0

  for(element in arr){
    temp = map[element] ?:0
    map.put(element,temp + 1)
  }

  for(key in map.keys){
    if(map[key] ?:0 > max){
      maxKey = key
      max = map[key] ?:0
    }
  }

  return maxKey
}

fun main() {
  println(MeanMode(readLine()))
}
