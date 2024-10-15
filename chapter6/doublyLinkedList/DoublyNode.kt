package chapter6.doublyLinkedList

data class DoublyNode<T>(
    val data: T,
    var next: DoublyNode<T>? = null,
    var prev: DoublyNode<T>? = null
)
