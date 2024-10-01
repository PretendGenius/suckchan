package chapter1

fun main() {
    checkStability()
    bubbleSort()
}

//TODO. 정렬 안정성 확인
private fun checkStability() {
    val list = mutableListOf(2 to 'a', 2 to 'b', 1 to 'c')
    val size = list.size
    println("$list $size")

    for (i in 0 until size) {
        for (j in 0 until size - 1) {
            if (list[j].first > list[j + 1].first) {
                val temp = list[j]
                list[j] = list[j + 1]
                list[j + 1] = temp
            }
            println("$list $size")
        }
    }
}

//TODO. 버블 정렬
private fun bubbleSort() {
    val list = mutableListOf(5, 1, 4, 2, 8)
    val size = list.size

    //bubble sort
    //O(n2)
    for (i in 0 until size - 1) {
        var bool = false
        for (j in 0 until size - 1) {
            if (list[j] > list[j + 1]) {
                val temp = list[j]
                list[j] = list[j + 1]
                list[j + 1] = temp
                bool = true
            }
            println(list)
        }
        if (!bool) break
    }
}