class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        if(nums.size == 0) { return false }
        val numbers: MutableSet<Int> = HashSet()
        for (num in nums) {
            if(numbers.contains(num)) return true
            numbers.add(num)
        }
        
        return false
    }
}