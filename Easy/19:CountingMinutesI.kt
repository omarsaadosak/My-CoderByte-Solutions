import java.text.SimpleDateFormat

fun CountingMinutesI(str: String): String {

  val times = str.split("-")

  var format = SimpleDateFormat("hh:mmaa")
  var date0 = format.parse(times[0])
  var date1 = format.parse(times[1])

  var milesDiff = date1.getTime() - date0.getTime()
  //println(milesDiff.toString())
  val totalMinutesPerDay = 24 * 60

  var minDiff: Long
  if(milesDiff < 0 ){
    Math.abs(milesDiff)
    minDiff = totalMinutesPerDay - (milesDiff * -1 / (1000 * 60))
  }else{
    minDiff = milesDiff / (1000 * 60)
  }

  return minDiff.toString()
  
}

fun main() {
  println(CountingMinutesI(readLine()))
}
