class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val mapOfData: MutableMap<Int, Int> = HashMap()
        
        for (i in nums.indices) {
            val diff = target - nums.get(i)
            if (mapOfData.containsKey(nums[i])) {
                return intArrayOf(mapOfData[nums[i]]!!, i)
            }
            mapOfData[diff] = i
        }
        return IntArray(0)
    }
}