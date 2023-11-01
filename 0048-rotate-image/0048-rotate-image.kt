class Solution {
    fun rotate(matrix: Array<IntArray>): Unit {
        val N = matrix.size
        val newMatrix = Array(matrix.size) { IntArray(matrix.size) { 0 } }
        for(i in 0 until N){
            for(j in 0 until N){
                newMatrix[j][N-i-1] = matrix[i][j]
            }
        }
        for(i in 0 until N){
            for(j in 0 until N){
                matrix[i][j] = newMatrix[i][j]
            }
        }
    }
}