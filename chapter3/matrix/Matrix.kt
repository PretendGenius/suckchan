package chapter3.matrix

abstract class Matrix {
    abstract fun SetValue(row:Int, col:Int, value: Float)
    abstract fun Print()
    abstract fun Add(newMatrix: MatrixImpl): Matrix
    abstract fun Transpose(): Matrix
}