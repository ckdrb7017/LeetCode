class Solution {
    lateinit var isVisit: Array<Boolean>
    val answerList = mutableListOf<List<Int>>()
    var N = 0
    fun permuteUnique(nums: IntArray): List<List<Int>> {
        isVisit = Array(nums.size){false}
        N = nums.size
        nums.sort()
        
        recur( nums, mutableListOf())
        return answerList.toList()
    }

    fun recur(nums: IntArray, list: MutableList<Int>){
        if(list.size == N) {
            val newList = mutableListOf<Int>()
            list.forEach {
                newList.add(it)
            }
            answerList.add(newList)
            return
        }

        for(i in 0 until N){
            if (i != 0 && isVisit[i - 1].not() && nums[i] == nums[i - 1]) continue

            if(isVisit[i].not()){
                isVisit[i] = true
                list.add(nums[i])
                recur(nums, list)
                list.removeLast()
                isVisit[i] = false
            }
        }
    }
}
