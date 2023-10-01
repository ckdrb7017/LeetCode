class Solution {
    val answerList = hashSetOf<List<Int>>()
    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        nums.sort()
        val N = nums.size
        for (i in 0 until N - 3) {
            for (j in i + 1 until N - 2) {
                var start = j + 1
                var end = N - 1
                while (start < end) {
                    val sum = (nums[i].toLong() + nums[j].toLong() + nums[start].toLong() + nums[end].toLong())
                    if (sum > target) end--
                    else if (sum < target) start++
                    else {
                        answerList.add(listOf(nums[i], nums[j], nums[start], nums[end]))
                        start++
                        end--
                    }
                }
            }
        }

        return answerList.toList()
    }
}