package chapter4.stack

abstract class Stack<T> {
    abstract fun Push(push: T)
    abstract fun Pop(): T?
    abstract fun Peek(): T?
    abstract fun IsEmpty(): Boolean
    abstract fun Size(): Int
    abstract fun Print()
}