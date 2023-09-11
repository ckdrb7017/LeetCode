class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
         val num1Size = nums1.size
        nums2.forEachIndexed { index, i ->
            nums1[num1Size - index - 1] = i
        }

        nums1.sort()
    }
}