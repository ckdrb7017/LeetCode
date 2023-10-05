class Solution {
    val N = 9
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        return checkRow(board) && checkColumn(board) && checkSquare(board)
    }

    fun checkRow(board: Array<CharArray>): Boolean {
        for (i in 0 until N) {
            val hashSet = hashSetOf<Char>()
            board[i].forEach {
                if (hashSet.contains(it)) return false
                if(it !='.') hashSet.add(it)
            }
        }
        return true
    }

    fun checkColumn(board: Array<CharArray>): Boolean {
        for (j in 0 until N) {
            val hashSet = hashSetOf<Char>()
            for (i in 0 until N) {
                if (hashSet.contains(board[i][j])) return false
                if(board[i][j] != '.') hashSet.add(board[i][j])
            }
        }
        return true
    }

    fun checkSquare(board: Array<CharArray>): Boolean {
        for (i in 0 until 3) {
            for (j in 0 until 3) {
                val hashSet = hashSetOf<Char>()
                for (k in i * 3..i * 3 + 2) {
                    for (l in j * 3..j * 3 + 2) {
                        if (hashSet.contains(board[k][l])) return false
                        if(board[k][l] != '.') hashSet.add(board[k][l])
                    }
                }
            }
        }
        return true
    }
}