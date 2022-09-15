class Solution {
    fun maxProfit(prices: IntArray): Int {
        var left = 0
        var right = 1
        var maxProfit = 0
        
        while(right < prices.size) {
            if (prices[left] < prices[right]) {
                maxProfit = Math.max(maxProfit, prices[right] - prices[left])
                right++
            } else {
                left = right
                right++
            }
        }
        
        return maxProfit
    }
}