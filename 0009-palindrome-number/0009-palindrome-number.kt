class Solution {
    fun isPalindrome(x: Int): Boolean {
        val originStr = x.toString()
        val reversedStr = x.toString().reversed()
        originStr.forEachIndexed { index, c -> 
            if(originStr[index] != reversedStr[index]) return false
        } 
        return true
    }
}