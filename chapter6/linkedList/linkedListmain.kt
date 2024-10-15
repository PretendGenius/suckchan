package chapter6.linkedList

fun main(){
    val linkedList = LinkedListImpl<Int>()

    linkedList.append(1)
    linkedList.printList()

    linkedList.append(2)
    linkedList.printList()

    linkedList.append(3)
    linkedList.printList()

    linkedList.delete(2)
    linkedList.printList()

}