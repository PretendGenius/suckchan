package chapter6.linkedList

abstract class LinkedList<T> {
    protected var head: Node<T>? = null

    abstract fun append(value: T)
    abstract fun prepend(value: T)
    abstract fun delete(value: T)
    fun printList() {
        var current = head
        while (current != null) {
            print("${current.data} -> ")
            current = current.next
        }
        println()
    }
}
