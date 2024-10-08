package chapter3.SparseMatrix

abstract class SparseMatrix {
    abstract fun SetValue(row:Int, col:Int, value: Float)
    abstract fun GetValue(row: Int, col: Int): Int
    abstract fun PrintTerms()
    abstract fun Print()
}