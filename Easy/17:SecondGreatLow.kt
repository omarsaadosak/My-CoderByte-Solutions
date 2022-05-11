fun SecondGreatLow(arr: Array<Int>): String {

  var result:String

  if(arr.isEmpty() || arr.size<2)
    return "Error Data"
  
  var arrayWithoutDuplicate = removeDuplicates(arr)

  arrayWithoutDuplicate.sortDescending()

  if(arrayWithoutDuplicate.size > 1){
    result = arrayWithoutDuplicate[arrayWithoutDuplicate.size - 2].toString() + " " + arrayWithoutDuplicate[1].toString()
  }else{
      result = arrayWithoutDuplicate[0].toString() + " " + arrayWithoutDuplicate[0].toString()
  }

  return result
}

fun removeDuplicates(array: Array<Int>): Array<Int> {
  var result = HashSet<Int>()
  result.addAll(array)

  return result.toTypedArray()
}

fun main() {
  println(SecondGreatLow(readLine()))
}
