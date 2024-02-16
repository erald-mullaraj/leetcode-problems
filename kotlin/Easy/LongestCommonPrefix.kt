package Easy

fun main(){
    var a = arrayOf("flower","flow","flight")
    var c = arrayOf("a")
    var b = LongestCommonPrefix().longestCommonPrefix(a)
    println(b)
}

class LongestCommonPrefix {

    fun longestCommonPrefix(strs: Array<String>): String {
        var s = ""
        for (i in strs[0].indices){
            for(j in strs.indices){
                if(i == strs[j].length || strs[j][i] != strs[0][i]){
                    return s;
                }
            }
            s += strs[0][i]
        }
        return s;
    }
}