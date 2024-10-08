package chapter3.SparseMatrix

fun main(){
    val sparseMatrix = SparseMatrixImpl(4,6,6)

    sparseMatrix.SetValue(2,3,5.0f)
    sparseMatrix.SetValue(0,5,2.0f)
    sparseMatrix.SetValue(1,1,1.0f)
    sparseMatrix.SetValue(0,0,1.0f)
    sparseMatrix.SetValue(0,3,7.0f)
    sparseMatrix.SetValue(1,2,3.0f)
    sparseMatrix.SetValue(2,3,4.0f)

    //0이 아닌 terms만 출력
    sparseMatrix.PrintTerms()
    println()
    //전체 출력
    sparseMatrix.Print()

}