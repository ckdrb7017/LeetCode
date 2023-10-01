class Solution {
    var N = 0
    var answerList = mutableListOf<String>()
    fun generateParenthesis(n: Int): List<String> {
        N = n
        recur("(", 1, 0)
        
        return answerList
    }

    fun recur(str: String, openCount: Int, closeCount: Int) {
        if (openCount == N && closeCount == N) {
            answerList.add(str)
            return
        }

        for (i in 0 until 2) {
            if (i == 0 && openCount <= N) {
                recur("$str(", openCount + 1, closeCount)
            } else if (i == 1 && openCount > closeCount) {
                recur("$str)", openCount, closeCount + 1)
            }
        }
    }
}