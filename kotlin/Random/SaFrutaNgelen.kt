package Random

fun main (){
    var a = intArrayOf(1, 2, 1, 4, 3, 4, 1, 1)
    println(saFrutaNgelen(a))
}

fun saFrutaNgelen (frutat: IntArray) : Int{
    var s = mutableSetOf<Int>()
    var r = 0
    for(i in frutat.indices){
        if(s.contains(frutat[i])){
            r++;
        } else if (!s.contains(frutat[i]) && r == 0){
            s.add(frutat[i])
            r++;
        }
        else if (!s.contains(frutat[i]) && r == 1){
            s.clear()
            r--;
        } else {
            s.remove(frutat[i])
            r--;
        }
    }
    return r
}