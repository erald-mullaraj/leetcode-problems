fun main() {
    val a: IntArray = intArrayOf(1, 2, 3, 1)
    println(containsDuplicate2(a))
}

fun containsDuplicate(nums: IntArray): Boolean {
    val h = HashSet<Int>()
    for (n in nums){
        if (h.contains(n)){
            return true
        }
        h.add(n)
    }
    return false
}

fun containsDuplicate2(nums: IntArray): Boolean {
    val h = HashSet<Int>()
    for (n in nums)
        if (!h.add(n)) return true
    return false
}