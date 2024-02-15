package Easy

fun main(){

    val a : String = "Hello World d "
    println(lengthOfLastWord(a))
    println(lengthOfLastWord2(a))
}

fun lengthOfLastWord(s: String): Int {
    var nr = 0
    var l = s.length - 1
    for(i in l downTo 0){
        if (s[i] != ' '){
            nr = 1;
            for(j in i-1 downTo 0) {
                if (s[j] != ' ') {
                    nr++
                } else {
                    break;
                }
            }
            if(nr > 1){
                break;
            }
        }
    }
    return nr;
}

fun lengthOfLastWord2(s: String): Int {
    var i = s.length - 1
    var c = 0
    while (s[i] == ' '){
        i--
    }
    while (i >= 0 && s[i] != ' ') {
        c++
        i--
    }
    return c
}
