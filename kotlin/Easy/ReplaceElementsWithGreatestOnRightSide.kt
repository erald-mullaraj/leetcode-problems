package Easy

import java.util.*

fun main (){
    val a : IntArray = intArrayOf(1, 2, 3, 2, 5, 2, 3, 1)
    println(Arrays.toString(replaceElements(a)))
}

fun replaceElements(arr: IntArray): IntArray {
    var gr = -1;
    for( i in arr.size - 1 downTo 0){
        if( arr[i] > gr) {
            var t = gr;
            gr = arr[i]
            arr[i] = t;
        } else {
            arr[i] = gr;
        }
    }
    return arr;
}