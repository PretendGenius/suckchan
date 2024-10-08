package chapter3.matrix

fun main(){
    val matrix = MatrixImpl()

    matrix.SetValue(0,0,1.0f)
    matrix.SetValue(0,1,2.0f)
    matrix.SetValue(0,2,3.0f)
    matrix.SetValue(1,0,0.0f)
    matrix.SetValue(1,1,4.0f)
    matrix.SetValue(1,2,5.0f)
    matrix.SetValue(2,3,7.0f)

    matrix.Print()
    println()

    val add = matrix.Add(matrix)
    add.Print()
    println()

    //전치행렬
    val tr = matrix.Transpose()
    tr.Print()
}