package chapter5.queue

abstract class Queue<T> {
    abstract fun Enqueue(element:T)
    abstract fun Dequeue(): Any?
    abstract fun IsEmpty(): Boolean
    abstract fun IsFull(): Boolean
    abstract fun Size(): Int
    abstract fun setDebugFlag(boolean: Boolean)
    abstract fun Print()
}