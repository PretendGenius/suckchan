package chapter4.hanoi

fun main() {
    val hanoi = HanoiImpl()
    val disk = 3

    for (i in 0 until disk) {
        hanoi.Push('a' + i)
    }

    hanoi.Print()

    hanoi.moveDisk(disk, 0, 1, 2)
    hanoi.Print()
}

