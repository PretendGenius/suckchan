package chapter5.queue

fun main(){
    val queue = QueueImpl<Char>(12)

    queue.setDebugFlag(false)
    queue.Print()
    println(queue.Size())

    queue.Enqueue('A')
    queue.Print()
    println(queue.Size())

    queue.Enqueue('B')
    queue.Print()
    println(queue.Size())

    queue.Enqueue('C')
    queue.Print()

    queue.Enqueue('D')
    queue.Print()

    queue.Dequeue()
    queue.Print()

    queue.Dequeue()
    queue.Print()

    queue.Dequeue()
    queue.Print()

    for (i in 'E'..'K') {
        queue.Enqueue(i)
        queue.Print()
    }
}