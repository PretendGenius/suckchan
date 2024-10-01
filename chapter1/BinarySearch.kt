package chapter1

fun main() {
    val list = mutableListOf(2, 4, 5, 5, 6, 8, 9, 10, 12, 13)

    binarySearch(list, list.size, 8)

    //이진 탐색의 시간 복잡도
    // 최선 O(1)
    // 최악 O(log2n)
    // 평균 O(log2n)
}

fun binarySearch(list: MutableList<Int>, size: Int, key: Int): Int {

    var left = 0
    var right = size - 1

    while (left <= right) {

        val middle = (left + right) / 2
        println("middle $middle")

        if (key < list[middle]) {
            right = middle - 1
            println("right $right")
        } else if (key > list[middle]) {
            left = middle + 1
            println("left $left")
        } else {
            println("found $middle")
            return middle
        }
    }

    return -1
}