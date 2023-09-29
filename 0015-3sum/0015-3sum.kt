class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val answer = hashSetOf<List<Int>>()
        nums.sort()

        for (i in 0 until nums.size - 2) {
            val currentNum = nums[i]
            var start = i + 1
            var end = nums.size - 1
            while (start < end){
                val sum = currentNum + nums[start] + nums[end]
                if(sum > 0) {
                    end--
                } else if(sum < 0){
                    start++
                } else {
                    answer.add(listOf(currentNum, nums[start] , nums[end]))
                    start++
                }
            }
        }

        return answer.toList()
    }
}