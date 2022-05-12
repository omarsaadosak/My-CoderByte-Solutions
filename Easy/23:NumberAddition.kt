fun NumberAddition(str: String): Int {

  var sum = 0
  val regex = Regex("[^0-9]")
  val numbersWithoutLetter = regex.replace(str,"-")
  //println(numbersWithoutLetter)

  var numbers = numbersWithoutLetter.split("-".toRegex()).toTypedArray()
  //println(numbers.size)
  for(num in numbers){
    if(num.isNotEmpty())
      sum += num.toInt()
  }

  return sum;
  
}

fun main() {
  println(NumberAddition(readLine()))
}
