package chapter8

fun main() {
    val heap = HeapImpl()

    for (i in 10 downTo 1) {
        heap.insert(i)
    }

    for (i in 1..3) {
        println(heap.delete())
    }
}