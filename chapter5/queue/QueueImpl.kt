package chapter5.queue

class QueueImpl<T>(private val size: Int = 100) : Queue<T>() {
    private val queue: Array<Any?> = arrayOfNulls(size)
    private var front: Int = 0
    private var rear: Int = 0

    override fun Enqueue(element: T) {
        if (!IsFull()) {
            queue[rear] = element
            rear = (rear + 1) % (size)
        }
    }

    override fun Dequeue(): Any? {
        if (!IsEmpty()) {
            val result = queue[front]
            queue[front] = null
            front = (front + 1) % size
            return result
        }
        return null
    }

    override fun IsEmpty(): Boolean = front == rear


    override fun IsFull(): Boolean = front == (rear + 1) % (size)

    override fun Size(): Int {
        return if (front < rear) rear - front
        else if(front > rear) size-(front - rear)
        else 0
    }

    override fun setDebugFlag(boolean: Boolean) {
    }

    override fun Print() {
        var i = front
        while (i != rear) {
            print("${queue[i]} ")
            i = (i + 1) % size
        }
        println()
    }
}