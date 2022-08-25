class Solution {
    fun isPalindrome(s: String): Boolean {
       var i = 0
        var j = s.length - 1
        while (i < j) {
            val start = s[i]
            val end = s[j]
            if (!Character.isLetterOrDigit(start)) {
                i++
                continue
            }
            if (!Character.isLetterOrDigit(end)) {
                j--
                continue
            }
            if (start.toLowerCase() != end.toLowerCase()) {
                return false
            }
            i++
            j--
        }
        return true
    }
}