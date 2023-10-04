class Solution {
    var firstAns = -1
    var secondAns = -1
    var N = 0
    fun searchRange(nums: IntArray, target: Int): IntArray {
        N = nums.size-1
        findFirst(nums, target)
        findSecond(nums, target)

        return intArrayOf(firstAns, secondAns)
    }
    fun findFirst(nums: IntArray, target: Int){
        var left = 0
        var right = N
        while (left <= right) {
            val mid = (left + right) / 2
            if (nums[mid] < target) {
                left = mid + 1
            } else if (nums[mid] >= target) {
                right = mid - 1
                if(nums[mid] == target){
                    firstAns = mid
                }
            }
        }
    }
    fun findSecond(nums: IntArray, target: Int){
        if(firstAns == -1) return
        var left = firstAns
        var right = N
        while (left <= right) {
            val mid = (left + right) / 2
            if (nums[mid] <= target) {
                left = mid + 1
                if(nums[mid] == target){
                    secondAns = mid
                }
            } else if (nums[mid] > target) {
                right = mid - 1
            }
        }
    }
}