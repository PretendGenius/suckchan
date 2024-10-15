package chapter6.linkedList

class LinkedListImpl<T> : LinkedList<T>() {

    override fun append(value: T) {
        val newNode = Node(value)
        if (head == null) {
            //비어있으면 첫번쨰 노드
            head = newNode
            return
        }

        //리스트 끝 찾기
        var current = head
        while (current?.next != null) {
            current = current.next
        }
        //마지 노드의 next를 새로운 노드
        current?.next = newNode
    }

    override fun prepend(value: T) {
        //head를 새로운 노드의 next로
        val newNode = Node(value)
        newNode.next = head
        //새로운 노드를 head로
        head = newNode
    }

    override fun delete(value: T) {
        if (head == null) return

        //첫번쨰 삭제
        if (head?.data == value) {
            head = head?.next
            return
        }

        //값 찾기
        var current = head
        while (current?.next != null) {
            if (current.next?.data == value) {
                //삭제할 값 이전에서 삭제할 값 다음으로 연결
                current.next = current.next?.next
                return
            }
            current = current.next
        }
    }
}
