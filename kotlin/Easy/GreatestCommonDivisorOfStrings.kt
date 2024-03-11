package Easy

class Solution {
    fun gcdOfStrings(str1: String, str2: String): String {
        if (str1 + str2 != str2 + str1) return ""
        var a = str1.length
        var b = str2.length
        var l = a
        if (b < a) l = b
        if (a%l == 0 && b%l == 0) {
            return str1.substring(0, l)
        }
        for (i in l/2 downTo 0){
            if (a%i == 0 && b%i == 0) {
                return str1.substring(0, i)
            }
        }
        return ""
    }
}

fun main (){
    var s1 = "ABABAB"
    var s2 = "ABAB"
    var s = Solution2().gcdOfStrings(s1, s2)
    println(s)
}

