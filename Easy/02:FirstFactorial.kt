fun FirstFactorial(num: Int): Int {

  if(num == 1){
    return 1
  }else{
    return num * FirstFactorial(num - 1)
  }
  
}

fun main() {
  println(FirstFactorial(readLine()))
}
