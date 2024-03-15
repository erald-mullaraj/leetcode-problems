package Easy

class MatrixDiagonalSum{
    fun diagonalSum(mat: Array<IntArray>): Int {
        var l = mat[0].size
        var r = 0
        for(i in 0 until l){
            r += mat[i][i] + mat[l-i-1][i]
        }
        if(l%2 == 1){
            return r - mat[l/2][l/2]
        }
        return r
    }
}

fun main () {
    var b = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
    var a = MatrixDiagonalSum().diagonalSum(b)
    println(a)
}


