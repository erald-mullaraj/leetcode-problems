package Easy

fun main() {
    var a : String = "acc"
    var b : String = "ahbccgdb"
    println(isSubsequence(a ,b))
    println(isSubsequence2(a ,b))
}

fun isSubsequence(s: String, t: String): Boolean {
    var found = 0
    var jIndx = 0
    for (i in s.indices){
        for(j  in jIndx..t.length - 1){
            if(s[i] == t[j]){
                found++
                jIndx = j + 1;
                break;
            }
        }
    }
    return found == s.length;
}

fun isSubsequence2(s: String, t: String): Boolean {
    var sch = 0
    var tch = 0
    while(sch < s.length && tch < t.length){
        if(s[sch] == t[tch]) sch++
        tch++
    }
    return sch == s.length
}