fun ClosestEnemy(arr: Array<Int>): Int {

  var i=0
  var enemyIndex = -1
  var enemyTwoIndex = -1

  while(i < arr.size && (enemyIndex == -1 || enemyTwoIndex == -1)){
    if(arr[i] == 1){
      enemyTwoIndex = i
    }else if(arr[i] == 2){
      enemyIndex = i
    }
    i++
  }

  if(enemyIndex == -1 || enemyTwoIndex == -1){
    return 0
  }else{
    return Math.abs(enemyIndex - enemyTwoIndex)
  }
  
}

fun main() {
  println(ClosestEnemy(readLine()))
}
