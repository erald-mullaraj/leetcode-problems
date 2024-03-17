package Easy

class FindIndexOfFirstOccurrenceInString{
    fun strStr(haystack: String, needle: String): Int {
        for(i in 0 .. haystack.length - needle.length){
            label@
            while(haystack[i] == needle[0]){
                for(j in 1 until needle.length){
                    if(haystack[i + j] != needle[j]){
                        break@label
                    }
                }
                return i
            }
        }
        return -1
    }
}

fun main () {

    var a = FindIndexOfFirstOccurrenceInString().strStr("adaadfsd", "adf")
    println(a)
}