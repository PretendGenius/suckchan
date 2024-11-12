package chapter8

class HeapImpl(
    private val type: Heap = Heap.MIN
) {
    private val list = mutableListOf<Int>()

    fun insert(value: Int) {
        list.add(value)
        up(list.lastIndex)
    }

    fun delete(): Int? {
        if (list.isEmpty()) return null

        val root = list[0]
        val last = list.last()
        list[0] = last
        list.removeAt(list.lastIndex)
        down(0)
        return root
    }

    private fun up(index: Int) {
        if (index <= 0) return

        val parentIndex = (index - 1) / 2
        if (heapCompare(index, parentIndex)) {
            heapSwap(index, parentIndex)
            up(parentIndex)
        }
    }

    private fun down(index: Int) {
        val leftChildIndex = index * 2 + 1
        val rightChildIndex = index * 2 + 2
        var targetIndex = index

        if (leftChildIndex < list.size && heapCompare(rightChildIndex, targetIndex)) {
            targetIndex = leftChildIndex
        }

        if (rightChildIndex < list.size && heapCompare(rightChildIndex, targetIndex)) {
            targetIndex = rightChildIndex
        }

        if (targetIndex != index) {
            heapSwap(index, targetIndex)
            down(targetIndex)
        }
    }

    private fun heapCompare(firstIndex: Int, secondIndex: Int): Boolean {
        val firstValue = list[firstIndex]
        val secondValue = list[secondIndex]

        return if (type == Heap.MIN) {
            firstValue < secondValue
        } else {
            firstValue > secondValue
        }
    }

    private fun heapSwap(firstIndex: Int, secondIndex: Int) {
        val temp = list[firstIndex]
        list[firstIndex] = list[secondIndex]
        list[secondIndex] = temp
    }
}