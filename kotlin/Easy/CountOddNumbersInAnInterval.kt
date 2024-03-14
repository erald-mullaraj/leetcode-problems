package Easy

class CountOddNumbersInAnInterval{
    fun countOdds(low: Int, high: Int): Int {
        return (high + 1)/2 - low/2
    }
}

fun main () {
    var a = CountOddNumbersInAnInterval()
    println(a.countOdds(3, 5))
}