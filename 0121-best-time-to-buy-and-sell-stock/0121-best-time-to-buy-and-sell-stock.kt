class Solution {
       fun maxProfit(prices: IntArray): Int {
        var maxNum = 0
        var minNum = prices[0]

        for(i in 0 until prices.size){
            minNum = Math.min(minNum, prices[i])
            maxNum = Math.max(maxNum, prices[i] - minNum)
        }

        return maxNum
    }

    }