package Easy

class SignOfTheProductOfAnArray{
    fun arraySign(nums: IntArray): Int{
        var r = 1
        for(i in nums.indices){
            if(nums[i] == 0) return 0
            else if (nums[i] < 0) r *= -1
        }
        return r
    }
}

fun main () {
    var b = intArrayOf(-1, -2, 3, -1)
    var a = SignOfTheProductOfAnArray().arraySign(b)
    println(a)
}