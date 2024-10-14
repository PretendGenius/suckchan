package chapter5.deque

fun main(){
    val deque = DequeImpl<Char>(5)
    deque.Print()

    deque.PushFront('A')
    deque.Print()

    deque.PushFront('B')
    deque.Print()

    deque.PushBack('C')
    deque.Print()

    deque.PushBack('D')
    deque.Print()

    deque.PopFront()
    deque.Print()

    deque.PopBack()
    deque.Print()
}