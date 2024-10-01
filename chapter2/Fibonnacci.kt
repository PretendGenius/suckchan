package chapter2

fun main() {
    println(fibonnacciRepeat(5))

    println(fibonnacciRecursion(5))
}

fun fibonnacciRepeat(num: Int): Int {
    if (num == 0) return 0
    else if (num == 1) return 1
    else {
        var fir = 0
        var sec = 1
        var res = 0
        for (i in 2 ..num) {
            res = fir+sec
            fir = sec
            sec = res
        }
        return res
    }
}

fun fibonnacciRecursion(num: Int): Int {
    return when (num) {
        0 -> 0
        1 -> 1
        else -> fibonnacciRecursion(num - 1) + fibonnacciRecursion(num - 2)
    }
}