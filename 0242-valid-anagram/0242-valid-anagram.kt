class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val firstArr = Array(26) { 0 }
        val secondArr = Array(26) { 0 }
        s.forEach { 
            firstArr[it-'a']++
        }
        t.forEach {
            secondArr[it-'a']++
        }
        firstArr.forEachIndexed { index, i ->  
            if(firstArr[index] != secondArr[index]) return false
        }
        return true
    }
}