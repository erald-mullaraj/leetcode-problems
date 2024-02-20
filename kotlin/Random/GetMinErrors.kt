package Random

fun main () {
    var eStr = "101!1"
    var x = 2
    var y = 3
    println(getMinErrors(eStr, x, y))
}

private fun getMinErrors(s : String, x : Int, y : Int) : Int{
    var errors = Array(2){0}
    var sbs0 = calcSubs(s, 0)
    var sbs1 = calcSubs(s, 1)
    errors[0] = ((sbs0[0]*x) % 1000000007 + (sbs0[1]*y) % 1000000007) % 1000000007
    errors[1] = ((sbs1[0]*x) % 1000000007 + (sbs1[1]*y) % 1000000007) % 1000000007

    return if (errors[0] <= errors[1]) errors[0] else errors[1]
}

private fun calcSubs(s : String, a : Int) : Array<Int>{
    var ones = 0
    var zeros = 0
    var sbs = Array(2){0}
    for(i in s.indices){
        if(a == 0 && s[i] == '!'){
            zeros++
            sbs[1] += ones;
        }
        if(a == 1 && s[i] == '!'){
            ones++
            sbs[0] += zeros
        }
        if(s[i] == '1'){
            ones++
            sbs[0] += zeros
        }
        if(s[i] == '0'){
            zeros++
            sbs[1] += ones
        }
    }
    return sbs
}