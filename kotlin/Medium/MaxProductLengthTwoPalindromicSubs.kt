package Medium

fun main(){
    var a = "helelele"
    var b = maxProduct(a)
    print(b)
}


    fun maxProduct(s: String): Int{
        sbsclc(s, "", "", 0)
        return r;
    }
    var r = 0
    fun plen(sbs: String): Int{
        var sl = sbs.length
        if(sl == 0){return 0}
        if(sl == 1){return 1}
        else{
            return if (sbs[0] === sbs[sl - 1]) plen(sbs.substring(1, sl - 1)) + 2
            else maxOf(plen(sbs.substring(1)), plen(sbs.substring(0, sl - 1)))
        }
    }

    fun sbsclc(s: String, s1: String, s2: String, i: Int) {
        if(i == s.length){
            r = maxOf(r, plen(s1) * plen(s2))
            return
        }
        sbsclc(s, s1 + s[i], s2, i + 1)
        sbsclc(s, s1, s2 + s[i], i + 1)
    }

