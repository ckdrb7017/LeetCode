class Solution {
    fun lengthOfLongestSubstring(s: String): Int {

        var maxCount = 0
        var start = 0
        var end = 0
        val hashSet = hashSetOf<Char>()
        if(s == "") return 0
        while (start <= end && end < s.length){
            val char = s.get(end)
            if(hashSet.contains(char)){
                hashSet.remove(s[start])
                start++
            }else {
                hashSet.add(s[end])
                maxCount = Math.max(maxCount, end - start)
                end++
            }
        }
        
        return maxCount+1
    }
}