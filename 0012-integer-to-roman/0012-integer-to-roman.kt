class Solution {
    fun intToRoman(num: Int): String {
        val sb = StringBuilder()
        var currentNum = num
        val romanList = listOf(
            Roman("M",1000),
            Roman("CM",900),
            Roman("D",500),
            Roman("CD",400),
            Roman("C",100),
            Roman("XC",90),
            Roman("L",50),
            Roman("XL",40),
            Roman("X",10),
            Roman("IX",9),
            Roman("V",5),
            Roman("IV",4),
            Roman("I",1),
        )

        while (currentNum != 0){
            for(i in 0 until  romanList.size){
                if(currentNum - romanList[i].num >= 0){
                    currentNum -= romanList[i].num
                    sb.append(romanList[i].char)
                    break
                }
            }
        }

        return sb.toString()
    }
    
    data class Roman(val char: String, val num: Int)}