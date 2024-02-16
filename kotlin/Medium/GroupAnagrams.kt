package Medium

import java.util.*

fun main () {
    var a = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
    var cl = GroupAnagrams().groupAnagrams(a);
    println(cl);

}

class GroupAnagrams {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val r: HashMap<String, MutableList<String>> = hashMapOf()

        for (s in strs){
            val c = IntArray(26)
            for (ch in s){
                val index = ch - 'a'
                c[index]++
            }
            val b = c.joinToString()
            r[b] = r.getOrDefault(b, mutableListOf()).also { it.add(s) }
        }

        return r.values.toList()
    }

}