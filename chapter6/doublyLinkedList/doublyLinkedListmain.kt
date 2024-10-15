package chapter6.doublyLinkedList

fun main(){
    val linkedList = DoublyLinkedListImpl<Int>()

    linkedList.append(1)
    linkedList.printList()

    linkedList.append(3)
    linkedList.printList()

    linkedList.append(4)
    linkedList.printList()

    linkedList.insert(2, 1)
    linkedList.printList()

    linkedList.printList()
    linkedList.printList()

    // 5를 리스트 끝에 삽입
    linkedList.insert(5, 100)
    linkedList.printList()

}