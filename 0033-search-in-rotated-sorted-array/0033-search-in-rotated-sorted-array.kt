class Solution {
    fun search(nums: IntArray, target: Int): Int {

        if (nums.size == 1) {
            return if (nums[0] == target) 0 else -1
        }

        var left = 0
        var right = nums.size - 1
        while (left <= right) {
            val mid = (left + right) / 2
            if (nums[mid] <= nums[nums.size - 1]) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }

        val leftToMidRes = binarySearch(nums, 0, left-1, target)
        val midToRightRes = binarySearch(nums, left, nums.size - 1, target)
    
        return Math.max(leftToMidRes, midToRightRes)
    }

    fun binarySearch(nums: IntArray, left: Int, right: Int, target: Int): Int {
        var mLeft = left
        var mRight = right
        while (mLeft <= mRight) {
            val mid = (mLeft + mRight) / 2
            if (nums[mid] < target) {
                mLeft = mid + 1
            } else if (nums[mid] > target) {
                mRight = mid - 1
            } else {
                return mid
            }
        }
        return -1
    }
}