class Solution {
    fun reverse(x: Int): Int {
        val flag = x < 0
        val res = x.toString().removePrefix("-").reversed().toIntOrNull() ?: return 0
        return if(flag) -res else res
    }
}