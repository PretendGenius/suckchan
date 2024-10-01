package chapter1

fun main(){
    compressionString()
}

//TODO. 문자열 압축
private fun compressionString(){
    val list = mutableListOf("a", "b", "a", "b", "c", "d", "f", "d", "c", "e", "e", "d", "a", "g", "g")
    val size = list.size
    println(list)

    list.sort()
    println(list)

    var key = list[0]
    var count = 0
    for (i in 0 until size){
        if(list[i] == key){
            count++
        }else{
            print("$key $count  ")
            key = list[i]
            count = 1
        }
    }
}