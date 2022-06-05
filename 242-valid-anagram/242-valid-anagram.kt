class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        if (s == t) return true
        
        val sMap: MutableMap<Char, Int> = HashMap()
        val tMap: MutableMap<Char, Int> = HashMap()
        
        for (i in s.indices) {
            sMap.merge(
                s[i], 1
            ) { a: Int?, b: Int? ->
                Integer.sum(
                    a!!,
                    b!!
                )
            }
            tMap.merge(
                t[i], 1
            ) { a: Int?, b: Int? ->
                Integer.sum(
                    a!!,
                    b!!
                )
            }
        }
        
        for (c in sMap.keys) {
            if (sMap[c] != tMap[c]) return false
        }
        return true
    }
}