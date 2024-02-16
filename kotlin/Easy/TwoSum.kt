package Easy

import java.util.*

fun main (){
    val a : IntArray = intArrayOf(2,7,11,15)
    val r = TwoSum().twoSum2(a, 9)
    println(Arrays.toString(r))
}

class TwoSum{
    fun twoSum(nums: IntArray, target: Int): IntArray{
        var l = nums.size - 1
        var r  = IntArray(2)
        for(i in 0..l){
            for(j in i+1..l ){
                if(nums[i] + nums[j] == target){
                    r[0] = i
                    r[1] = j
                }
            }
        }
        return r;
    }

    fun twoSum2(nums: IntArray, target: Int): IntArray {
        var map = mutableMapOf<Int,Int>()
        var l = nums.size - 1
        for(i in 0..l){
            val c = target - nums[i]
            if(map.containsKey(c)){
                return intArrayOf(map[c]!!,i)
            }
            map[nums[i]]=i
        }
        return intArrayOf()
    }
}



