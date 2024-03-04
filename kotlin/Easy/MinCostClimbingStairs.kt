package Easy

fun main() {
    var a : IntArray = intArrayOf(1,100,1,1,1,100,1,1,100,1)
    println(minCostClimbingStairs2(a))
}

private fun minCostClimbingStairs(cost: IntArray): Int {
    var f = 0;
    var s = 0;
    for(i in  cost.size - 1 downTo 0 ){
        cost[i] += if (f <= s) f else s
        s = f
        f = cost[i]
    }
    return if (cost[0] <= cost[1]) cost[0] else cost[1]
}

fun minCostClimbingStairs2(cost: IntArray): Int {
    val s = cost.size
    for (i in 2 until s) {
        cost[i] += if (cost[i - 1] <= cost[i - 2]) cost [i - 1] else cost [i - 2]
    }
    return if (cost[s - 1] <= cost[s - 2]) cost[s -1] else cost[s - 2]
}