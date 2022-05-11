fun ArithGeo(arr: Array<Int>): String {

  val difference = arr[1] - arr[0]
  var ratio : Double

  var isArithmatic = true
  var isGeometric = true
  var i = 0

  if(arr[0] == 0){
    isGeometric = false
    ratio = 0.0
  }else{
    ratio = arr[1].toDouble() / arr[0]
  }

  while (i < arr.size-1 && (isArithmatic || isGeometric)){
    //println(i)
    if(arr[i+1] - arr[i] != difference){
      isArithmatic = false
    }
    if(arr[i] != 0){
      if(arr[i+1].toDouble() / arr[i] != ratio){
        isGeometric = false
      }
    }else{
      isGeometric = false
    }
    i++
  }

  return if(isGeometric) "Geometric" else if(isArithmatic) "Arithmatic" else "-1"
  
}

fun main() {
  println(ArithGeo(readLine()))
}
