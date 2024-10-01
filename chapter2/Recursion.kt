package chapter2

fun main(){
    fun1()
    recursion(5)
}

fun fun1(){
    println(1)
    fun2()
}

fun fun2(){
    println(2)
}

fun recursion(count: Int){
    if (count==0) return

    print("$count ")
    recursion(count-1)
}