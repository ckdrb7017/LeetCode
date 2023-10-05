class Solution {
    var target = 0
    var candidates = intArrayOf()
    val answer = mutableListOf<List<Int>>()

    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        this.candidates = candidates
        this.target = target

        combinate(0, arrayListOf(), 0)

        return answer
    }

    fun combinate(start: Int, arrayList: ArrayList<Int>, sum: Int) {
        if (sum > target) return
        if (sum == target) {
            answer.add(arrayList.toList())
            return
        }
        for (i in start until candidates.size) {
            arrayList.add(candidates[i])
            combinate(i, arrayList, sum + candidates[i])
            arrayList.removeLast()
        }
    }
}