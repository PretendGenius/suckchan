package chapter6.doublyLinkedList

abstract class DoublyLinkedList<T> {
    protected var head: DoublyNode<T>? = null
    protected var tail: DoublyNode<T>? = null

    abstract fun append(value: T)
    abstract fun prepend(value: T)
    abstract fun insert(value: T, position: Int)
    abstract fun delete(value: T)

    fun printList() {
        var current = head
        while (current != null) {
            print("${current.data} -> ")
            current = current.next
        }
        println()
    }

    fun reversePrintList() {
        var current = tail
        while (current != null) {
            print("${current.data} -> ")
            current = current.prev
        }
        println()
    }
}