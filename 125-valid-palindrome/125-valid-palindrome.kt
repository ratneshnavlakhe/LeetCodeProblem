class Solution {
    fun isPalindrome(s: String): Boolean {
        val palString = Regex("[^A-Za-z0-9]").replace(s, "").toLowerCase()
        if (palString.length == 0) {
            return true
        }
        if (palString.length % 2 == 1) {
            val firstString = palString.take(palString.length / 2)
            val lastString = palString.takeLast(palString.length / 2).reversed()
            
            if (firstString == lastString) {
                return true
            }
            // println(palString.length / 2)
        } else {
            val firstString = palString.take(palString.length / 2)
            val lastString = palString.takeLast(palString.length / 2).reversed()
            
            if (firstString == lastString) {
                return true
            }
        }
        return false
    }
}