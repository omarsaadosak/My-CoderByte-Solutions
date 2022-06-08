fun TimeDifference(strArr: Array<String>): String {

  var difference:Int
  var timeMinI:Int
  var timeMinJ:Int
  var smallest = -1

  for(i in 0..strArr.size-1){
    timeMinI = getMinutes(strArr[i])
    for(j in i+1..strArr.size-1){
      timeMinJ = getMinutes(strArr[j])
      difference = Math.abs(timeMinI - timeMinJ)
      //println("diff is " + difference)
      if(smallest == -1 || difference < smallest){
        smallest = difference
      }
      //println("smallest is " + smallest)
    }
  }

  return smallest.toString();
  
}

fun getMinutes(str: String): Int{
  val time = str.dropLast(2).split(":")
  val timeMinute = time[1].toInt()
  var timeHour = time[0].toInt()
  if(str.contains("pm") || (str.contains("am") && timeHour ==12)){
    timeHour += 12
  }
  var res = timeHour*60 + timeMinute
  //println(res)
  return res
}

fun main() {
  println(TimeDifference(readLine()))
}
