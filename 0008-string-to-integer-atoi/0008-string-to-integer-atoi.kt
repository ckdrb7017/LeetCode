class Solution {
    var ans = 0L
    var isMinus = false
    var flagCount = 0
    var numCount = 0

    fun myAtoi(s: String): Int {
        s.forEach {
            if (it == '-' || it == '+') {
                if(numCount > 0 || flagCount > 0) return getResult()
                isMinus = (it == '-')
                flagCount++
            } else if (it in '0'..'9') {
                ans *= 10
                ans += it.digitToInt()
                numCount++
                if(ans > Int.MAX_VALUE || ans < Int.MIN_VALUE){
                    return getResult()
                }
            } else if (it != ' ') {
                return getResult()
            } else if(numCount > 0 || flagCount > 0){
                return getResult()
            }

            if(flagCount > 1) return getResult()
        }

        return getResult()
    }

    fun getResult(): Int {
        if (isMinus) {
            ans *= -1
        }
        if (ans > Int.MAX_VALUE) {
            ans = Int.MAX_VALUE.toLong()
        } else if (ans < Int.MIN_VALUE) {
            ans = Int.MIN_VALUE.toLong()
        }

        return ans.toInt()
    }
}