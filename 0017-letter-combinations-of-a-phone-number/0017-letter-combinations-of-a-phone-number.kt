class Solution {
    val hashMap = hashMapOf<Char, List<Char>>()
    val answerList = mutableListOf<String>()

    fun letterCombinations(digits: String): List<String> {
        if(digits == "") return emptyList()
        
        hashMap['2'] = listOf('a', 'b', 'c')
        hashMap['3'] = listOf('d', 'e', 'f')
        hashMap['4'] = listOf('g', 'h', 'i')
        hashMap['5'] = listOf('j', 'k', 'l')
        hashMap['6'] = listOf('m', 'n', 'o')
        hashMap['7'] = listOf('p', 'q', 'r', 's')
        hashMap['8'] = listOf('t', 'u', 'v')
        hashMap['9'] = listOf('w', 'x', 'y', 'z')

        recur(0, digits, "")
        return answerList
    }

    fun recur(index: Int, digits: String, string: String){
        if(index == digits.length){
            answerList.add(string)
            return
        }
        hashMap[digits[index]]!!.forEach {
            recur(index+1, digits, "$string$it")
        }
    }
}