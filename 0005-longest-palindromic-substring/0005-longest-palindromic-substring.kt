class Solution {
    fun longestPalindrome(s: String): String {
        val N = s.length
        var maxStart = 0
        var maxEnd = 0
        val dp = Array(N) { Array(N) { false } }
        for (i in 0 until N - 1) {
            dp[i][i] = true
            if (s[i] == s[i + 1]) {
                dp[i][i + 1] = true
            }
        }
        dp[N - 1][N - 1] = true

        for (i in 2 until N) {
            for (j in 0 until N - i) {
                if (dp[j + 1][j + i - 1] && s[j] == s[j + i]) {
                    dp[j][j + i] = true
                }
            }
        }

        for (i in 0 until N - 1) {
            for (j in i until N) {
                if (dp[i][j] && j - i > maxEnd - maxStart) {
                    maxStart = i
                    maxEnd = j
                }
            }
        }
        
        return s.substring(maxStart, maxEnd + 1)
    }
}