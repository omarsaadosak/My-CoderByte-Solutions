fun OffLineMinimum(strArr: Array<String>): String {

  var tempArr = sortedSetOf<Int>()
  var res = ""

  //println(res)
  //println(tempArr)

  for(element in strArr){
    if(element == "E"){
      res = res + tempArr.first().toString() + ","
      tempArr.remove(tempArr.first())
    }else{
      tempArr.add(Integer.parseInt(element.toString()))
    }
    //println(res)
    //println(tempArr)
  }
    
  return res.dropLast(1);
  
}
