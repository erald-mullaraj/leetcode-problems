package Easy

import java.util.*

fun main (){
    val a : IntArray = intArrayOf(1, 2, 3, 1)
    println(Arrays.toString(getConcatenation(a)))
}

fun getConcatenation(nums: IntArray): IntArray {
    val a = nums.size
    val nA = IntArray(a * 2)
    for(i in nums.indices) {
        nA[i] = nums[i]
        nA[i + a] = nums[i]
    }
    return nA
}