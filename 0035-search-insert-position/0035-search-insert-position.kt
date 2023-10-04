class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1
        var ans = -1
        while (left <= right) {
            val mid = (left + right) / 2
            if (mid - 1 >= 0 && target in nums[mid - 1]..nums[mid]) {
                if (target == nums[mid - 1]) ans = mid - 1
                else ans = mid
                break
            } else if (nums[mid] < target) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }

        return if (ans == -1) left else ans
    }
}