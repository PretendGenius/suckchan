package chapter1

fun main() {
    sort()
    ascSort()
    asdSort3()
    findMinValue()
    findMinValueIndex()
}

//배열 요소 swap
private fun sort() {
    val list = mutableListOf(1, 2)

    println("${list[0]} ${list[1]}")

    val temp = list[0]
    list[0] = list[1]
    list[1] = temp

    println("${list[0]} ${list[1]}")
}

//배열 요소 오름차순 정렬
private fun ascSort() {
    val list = mutableListOf(0, 0)

    for (i in 0..4) {
        for (j in 0..4) {
            list[0] = j
            list[1] = i

            //TODO. 정렬
            if (list[0] > list[1])
                list[0] = list[1]
            //

            if (list[0] <= list[1])
                println("${list[0]} ${list[1]} " + true)
            else
                println("${list[0]} ${list[1]} " + false)
        }
    }
}

//배열 요소 3개 오름차순 정렬
private fun asdSort3() {
    for (k in 0 until 3) {
        for (j in 0 until 3) {
            for (i in 0 until 3) {

                val list = mutableListOf(i, j, k)
                val size = 3

                for (e in 0 until size) {
                    print("${list[e]} ")
                }
                print(" -> ")

                //TODO. 3개 정렬하기
                if (list[0] > list[1]) list[0] = list[1]
                if (list[1] > list[2]) list[1] = list[2]
                if (list[0] > list[1]) list[0] = list[1]
                //

                for (e in 0 until size) {
                    print("${list[e]} ")
                }

                println(checkSorted(list, size))
            }
        }
    }
}

//TODO. 정렬 판단
private fun checkSorted(list: MutableList<Int>, size: Int): Boolean {
    for (i in 0 until size - 1) {
        if (list[i] > list[i + 1])
            return false
    }
    return true
}


//TODO. 배열 최솟값 찾기
private fun findMinValue() {
    val list = mutableListOf(8, 3, 2, 5, 1, 1, 2, 5, 8, 9)
    val size = list.size

    assert(size > 0)
    for (i in 0 until size) {
        for (j in 1 until size) {
            if (list[i] > list[j]) {
                list[i] = list[j]
            }
        }
    }
    println(list[0])
}

//TODO. 배열 최솟값 인덱스 찾기
private fun findMinValueIndex() {
    val list = mutableListOf(8, 3, 2, 5, 1, 1, 2, 5, 8, 9)
    val size = list.size

    var minIndex = 0
    assert(size > 0)
    for (i in 0 until size) {
        if (list[i] < list[minIndex]) {
            minIndex = i
        }
    }
    println(minIndex)
}