package chapter1

fun main() {
    pushRight()
    pushRight()
}

//Todo. 오른쪽으로 밀기
private fun pushRight() {
    val list = mutableListOf(1, 2, 4, 5, 3, 6)
    val size = list.size

    var j = 4
    val key = list[4]

    while (j > 0 && list[j - 1] > key) {
        list[j] = list[j - 1]
        j--
    }
    list[j] = key

    println(list)
}

//Todo. 삽입 정렬
private fun insertSort() {
    val list = mutableListOf(1, 2, 4, 5, 3, 6)
    val size = list.size

    for (i in 1 until size) {
        val key = list[i]
        var j = i
        while (j > 0 && list[j - 1] > key) {
            list[j] = list[j - 1]
            j--
        }
        list[j] = key

        println(list)
    }
}