package Easy

fun main (){
    var a : String = "anagram"
    var b : String = "ramana"
    println(isAnagram(a, b))
}

fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    val r = Array(26) {0}
    for (i in s.indices) {
        r[s[i] - 'a']++
        r[t[i] - 'a']--
    }
    for (o in r){
        if (o != 0) return false;
    }
    return true
}