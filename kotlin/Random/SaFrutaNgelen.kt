package Random

fun main (){
    var a = intArrayOf(1, 2, 1, 4, 3, 4, 1, 1)
    println(saFrutaNgelen(a))
}

fun saFrutaNgelen (frutat: IntArray) : Int{
    var f = frutat[0]
    var r = 0
    for(i in frutat.indices){
        if(f == frutat[i]) r++
        else if (f != frutat[i]){
            if(r == 0){
                f = frutat[i]
                r++
            }
            if(r == 1){
                f = 0
                r--
            }
            r--;
        }
    }
    return r
}