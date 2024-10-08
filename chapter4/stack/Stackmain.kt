package chapter4.stack

fun main(){
    val stack = StackImpl<Char>()

    stack.Push('a')
    stack.Print()

    stack.Push('b')
    stack.Print()

    stack.Push('c')
    stack.Print()

    println(stack.Peek())

    stack.Pop()
    stack.Print()

    stack.Pop()
    stack.Print()

    stack.Push('e')
    stack.Print()

    stack.Pop()
    stack.Pop()
    stack.Print()
    println(stack.IsEmpty())

    //문자열 거꾸로
    val string = "hello, world!"
    string.forEach {
        stack.Push(it)
    }
    for (i in string.indices){
        print(stack.Peek())
        stack.Pop()
    }

}