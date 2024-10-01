package chapter2

fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println(normalAdd(list, list.size))
    println(recursionAdd(list, list.size))
}

fun normalAdd(list: MutableList<Int>, size: Int): Int {
    var sum = 0
    for (i in 0 until size) {
        sum += list[i]
    }
    return sum
}

fun recursionAdd(list: MutableList<Int>, size: Int): Int {
    if (size <= 0) return 0
    return recursionAdd(list, size - 1) + list[size - 1]
}