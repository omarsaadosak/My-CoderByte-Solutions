fun LargestPair(num: Int): Int {

  val input = num.toString()

  if(input.length < 2){
    return -1
  }

  var temp: Int
  var largestPair = Integer.parseInt(input.substring(0,2))

  for(i in 1..input.length-2){
    temp = Integer.parseInt(input.substring(i,i+2))
    if(temp > largestPair){
      largestPair = temp
    }
  }

  return largestPair;
  
}

fun main() {
  println(LargestPair(readLine()))
}
