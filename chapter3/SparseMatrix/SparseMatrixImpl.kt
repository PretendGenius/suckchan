package chapter3.SparseMatrix

import chapter3.matrix.MatrixTerms

class SparseMatrixImpl(
    private val maxRow: Int,
    private val maxCol: Int,
    private val nonZero: Int,
) : SparseMatrix() {

    private val matrix: Array<Array<MatrixTerms>> =
        Array(maxRow) { row -> Array(maxCol) { col -> MatrixTerms(row, col, 0.0f) } }

    override fun SetValue(row: Int, col: Int, value: Float) {
        if (row in 0 until maxRow && col in 0 until maxCol) {
            matrix[row][col] = MatrixTerms(row, col, value)
        }
    }

    override fun GetValue(row: Int, col: Int): Int {
        return matrix[row][col].value.toInt()
    }

    override fun PrintTerms() {
        for (i in 0 until maxRow){
            for (j in 0 until maxCol){
                if (matrix[i][j].value.toInt()!=0){
                    println("(${i}, ${j}, ${matrix[i][j].value.toInt()})")
                }
            }
        }

    }

    override fun Print() {
        for (row in matrix) {
            for (term in row) {
                print("${term.value.toInt()} ")
            }
            println()
        }
    }
}