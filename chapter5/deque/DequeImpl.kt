package chapter5.deque

class DequeImpl<T>(private val size: Int = 100) : Deque<T>() {
    private val deque: Array<Any?> = arrayOfNulls(size)
    private var front: Int = 0
    private var rear: Int = 0

    override fun PushFront(element: T) {
        if (!IsFull()) {
            front = (front - 1 + size) % size
            deque[front] = element
        }
    }

    override fun PushBack(element: T) {
        if (!IsFull()) {
            deque[rear] = element
            rear = (rear + 1) % size
        }
    }

    override fun PopFront(): Any? {
        if (!IsEmpty()) {
            val result = deque[front]
            deque[front] = null
            front = (front + 1) % size
            return result
        }
        return null
    }

    override fun PopBack(): Any? {
        if (!IsEmpty()) {
            rear = (rear - 1 + size) % size
            val result = deque[rear]
            deque[rear] = null
            return result
        }
        return null
    }

    override fun Print() {
        var i = front
        while (i != rear) {
            print("${deque[i]} ")
            i = (i + 1) % size
        }
        println()
    }

    override fun IsEmpty(): Boolean = front == rear && deque[front] == null

    override fun IsFull(): Boolean = front == (rear + 1) % size
}