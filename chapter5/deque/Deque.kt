package chapter5.deque

abstract class Deque<T> {
    abstract fun PushFront(element: T)
    abstract fun PushBack(element: T)
    abstract fun PopFront(): Any?
    abstract fun PopBack(): Any?
    abstract fun Print()
    abstract fun IsEmpty(): Boolean
    abstract fun IsFull(): Boolean

}