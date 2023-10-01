class Solution {
    fun romanToInt(s: String): Int {
        var sum = 0
        sum = s.mapIndexed { index, c ->
            val currentNum = c.getRomanNum()
            val nextNum = (s.getOrNull(index + 1) ?: ' ').getRomanNum()
            if(currentNum < nextNum) -currentNum
            else currentNum
        }.sum()
        
        return sum
    }

    fun Char.getRomanNum(): Int {
        return when (this) {
            'M' -> 1000
            'D' -> 500
            'C' -> 100
            'L' -> 50
            'X' -> 10
            'V' -> 5
            'I' -> 1
            else -> 0
        }
    }
}