package Easy

class HappyNumber {
    fun isHappy(n: Int): Boolean {
        var a = 0
        var b = n
        while(a != 4){
            a = 0
            while(b > 0){
                var r = b%10
                a += r*r
                b /= 10
            }
            if (a == 1) return true;
            b = a
        }
        return false
    }
}

fun main () {
    var a = HappyNumber().isHappy(7)
    println(a)
}
