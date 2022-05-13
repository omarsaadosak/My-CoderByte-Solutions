fun NextPalindrome(num: Int): Int {

  var number = num + 1
  while(!isPalindrome(number)){
    number ++
  }

  return number
}

fun isPalindrome(num: Int): Boolean{
  var originNum = num.toString()
  var reversedNum = originNum.reversed()

  if (originNum == reversedNum) return true else return false
}

fun main() {
  println(NextPalindrome(readLine()))
}
