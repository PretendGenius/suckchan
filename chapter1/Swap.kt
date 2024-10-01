package chapter1

fun main(){
    printAB()
    useTempVariable()
}

//A B 출력
fun printAB(){
    val a = 3
    val b = 2
    println("$a $b")
}

//변수를 사용한 A B의 swap
fun useTempVariable(){
    var a = 3
    var b = 2
    val temp = a
    a = b
    b = temp

    println("$a $b")
}