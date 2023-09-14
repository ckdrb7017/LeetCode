class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        val first = strs.get(0)
        var start = 0
        if(first == "") return first
        var currentChar = ' '

        while (start < first.length){
            currentChar = first[start]
            for(i in 1 until strs.size){
                if(start >= strs[i].length || strs[i][start] != currentChar) return first.substring(0, start)
            }
            start++
        }

        return first.substring(0, start)
    }
}