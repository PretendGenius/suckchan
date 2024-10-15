package chapter6.doublyLinkedList

class DoublyLinkedListImpl<T> : DoublyLinkedList<T>() {
    override fun append(value: T) {
        val newNode = DoublyNode(value)
        //비어있을때
        if (head == null) {
            head = newNode
            tail = newNode
        } else {
            //이전노드 테일을 새로운 노드
            tail?.next = newNode
            //새로운 노드의 이전을 테일
            newNode.prev = tail
            //양방향 연결
            tail = newNode
        }
    }

    override fun prepend(value: T) {
        val newNode = DoublyNode(value)
        if (head == null) {
            head = newNode
            tail = newNode
        } else {
            newNode.next = head
            head?.prev = newNode
            head = newNode
        }
    }

    override fun insert(value: T, position: Int) {
        val newNode = DoublyNode(value)

        // 처음이면 prepend
        if (position == 0) {
            prepend(value)
            return
        }

        var current = head
        var index = 0

        // 삽입할 위치까지 이동
        while (current != null && index < position) {
            current = current.next
            index++
        }

        if (current != null) {
            val prevNode = current.prev
            //이전노드의 다음을 삽입노드
            prevNode?.next = newNode
            //삽입노드의 이전을 이전노드
            newNode.prev = prevNode
            //삽입노드의 다음을 원래 이어진 노드와 연결
            newNode.next = current
            //원래 이어진 노드의 이전을 삽입 노드와 연결
            current.prev = newNode
        } else {
            //인덱스가 끝을 넘으면
            append(value)
        }
    }

    override fun delete(value: T) {
        if (head == null) return

        var current = head

        while (current != null) {
            if (current.data == value) {
                //헤드면
                if (current == head) {
                    head = current.next
                    head?.prev = null
                }
                //테일이면
                if (current == tail) {
                    tail = current.prev
                    tail?.next = null
                }
                // 중간 노드
                if (current.prev != null) {
                    current.prev?.next = current.next
                }
                if (current.next != null) {
                    current.next?.prev = current.prev
                }
                return
            }
            current = current.next
        }
    }
}