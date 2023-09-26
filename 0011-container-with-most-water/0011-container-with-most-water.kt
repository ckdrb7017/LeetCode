class Solution {
    var maxNum = 0
    fun maxArea(height: IntArray): Int {
        var start = 0
        var end = height.size - 1


        while (start < end) {
            maxNum = Math.max(maxNum, getArea(start, end, height))
            if (height[start] < height[end]) {
                start++
            } else {
                end--
            }
        }

        return maxNum
    }

    fun getArea(start: Int, end: Int, height: IntArray): Int {
        return (end - start) * Math.min(height[start], height[end])
    }
}