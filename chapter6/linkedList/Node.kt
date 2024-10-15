package chapter6.linkedList

data class Node<T>(
    val data: T,
    var next: Node<T>? = null
)
