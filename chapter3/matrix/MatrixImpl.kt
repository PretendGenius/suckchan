package chapter3.matrix

class MatrixImpl(private val maxRow: Int = 3, private val maxCol: Int = 4) : Matrix() {
    private val matrix: Array<FloatArray> = Array(maxRow) { FloatArray(maxCol) }

    override fun SetValue(row: Int, col: Int, value: Float) {
        if (row in 0 until maxRow && col in 0 until maxCol) {
            matrix[row][col] = value
        }
    }

    override fun Print() {
        for (i in matrix) {
            println(i.joinToString(" ") { it.toInt().toString() })
        }
    }

    override fun Add(newMatrix: MatrixImpl): Matrix {
        val add = MatrixImpl()

        for (i in 0 until 3) {
            for (j in 0 until 4) {
                add.SetValue(i, j, this.matrix[i][j] + newMatrix.matrix[i][j])
            }
        }
        return add
    }

    override fun Transpose(): Matrix {
        val transpose = MatrixImpl(4, 3)

        for (i in 0 until 3) {
            for (j in 0 until 4) {
                transpose.SetValue(j, i, this.matrix[i][j])
            }
        }
        return transpose
    }
}
