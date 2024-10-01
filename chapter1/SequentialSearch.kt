package chapter1

fun main() {
    val list = mutableListOf(8, 1, 1, 3, 2, 5, 1, 2, 1, 1)
    val size = list.size

    println(count(list, size, 1))
    println(sequentialSearch(list, size, 1))

    insertionSort(list, size)
    println(sortedCount(list, size, 1))
}

fun count(list: MutableList<Int>, size: Int, key: Int): Int {
    var count = 0
    for (i in 0 until size) {
        if (list[i] == key) {
            count++
        }
    }
    return count
}

//TODO. 순차탐색
fun sequentialSearch(list: MutableList<Int>, size: Int, key: Int): Int {
    var i = 0
    while (i < size && list[i] != key) {
        i++
    }
    return if (i==size) -1 else i
}

fun insertionSort(list: MutableList<Int>, size: Int) {
    for (i in 1 until size) {
        val key = list[i]
        var j = i
        while (j > 0 && list[j - 1] > key) {
            list[j] = list[j - 1]
            j--
        }
        list[j] = key
    }
    println(list)
}

fun sortedCount(list: MutableList<Int>, size: Int, key: Int): Int {
    val i = sequentialSearch(list, size, key)

    return if (i >= 0)
        sortedCountHelper(list, size, key, i+1)+1
    else
        0
}

fun sortedCountHelper(list: MutableList<Int>, size: Int, key: Int, start: Int,): Int{
    var count = 0
    for (j in start until size) {
        if (list[j] == key) {
            count++
        } else break
    }
    return count
}