class Solution {
    fun isPalindrome(s: String): Boolean {
        val regex = "[a-zA-Z0-9]+"
        val pattern = Pattern.compile(regex)
        val matcher = pattern.matcher(s)
        val sb = StringBuilder()
        while (matcher.find()){
            sb.append(matcher.group())
        }
        val str = sb.toString().lowercase()

        for(i in 0 until str.length){
            if(str[i] != str[str.length-i-1]) return false
        }
        return true
    }
}