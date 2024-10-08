package chapter4.stack

class StackImpl<T>(private val size: Int = 100) : Stack<T>() {
    private val stack: Array<Any?> = arrayOfNulls(size)
    private var top: Int = -1

    override fun Push(push: T) {
        if (top == size - 1) println("full")
        else stack[++top] = push
    }

    override fun Pop(): T? {
        if (IsEmpty()) return null
        val item = stack[top]
        stack[top--] = null
        return item as T
    }

    override fun Peek(): T? {
        if (IsEmpty()) return null
        return stack[top] as T
    }

    override fun IsEmpty(): Boolean {
        return top == -1
    }

    override fun Size(): Int {
        return top + 1
    }

    override fun Print() {
        for (i in 0.. top){
            print("${stack[i]} ")
        }
        println()
    }
}