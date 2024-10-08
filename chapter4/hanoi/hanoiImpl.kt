package chapter4.hanoi

class HanoiImpl : hanoi() {
    private val hanoiTower: MutableList<MutableList<Char>> = mutableListOf(
        mutableListOf(),
        mutableListOf(),
        mutableListOf()
    )

    override fun Push(push: Char) {
        hanoiTower[0].add(push)
    }

    override fun Pop(index: Int): Char? {
        return if (hanoiTower[index].isNotEmpty()) {
            hanoiTower[index].removeAt(hanoiTower[index].size - 1)
        } else {
            null
        }
    }

    override fun Print() {
        for (i in hanoiTower.indices) {
            println("$i: ${hanoiTower[i].joinToString(" ")}")
        }
        println()
    }

    override fun moveDisk(n: Int, from: Int, temp: Int, to: Int) {
        if (n == 1) {
            //디스크꺼내기
            val disk = Pop(from) ?: return
            //디스크추가
            hanoiTower[to].add(disk)
            println("Move disk ${disk} from $from to $to")
            Print()
            return
        }
        moveDisk(n - 1, from, to, temp) // n-1 개의 디스크를 temp
        moveDisk(1, from, temp, to) // 나머지 디스크를 from 으로 이동
        moveDisk(n - 1, temp, from, to) // n-1 개의 디스크를 from 으로 이동
    }
}
