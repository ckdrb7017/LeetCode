class Solution {
    fun isPalindrome(s: String): Boolean  = s.filter { it.isLetterOrDigit() }.run { equals(reversed(), true) }
}