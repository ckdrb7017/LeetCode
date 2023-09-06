class Solution {
        val map = hashMapOf<Int, Int>()
        fun twoSum(nums: IntArray, target: Int): IntArray {
            for (i in 0 until nums.size) {
                map.put(nums[i], i)
            }
            
            for (i in 0 until nums.size) {
                val rest = target - nums[i]
                if(map.containsKey(rest) && map.get(rest) != i){
                    return intArrayOf(i, map.get(rest)!!)
                }
            }
            
            return intArrayOf(0, 0)
        }
}