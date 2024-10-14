package chapter5.calculation

import java.util.*

fun main() {
    val string = "1+2*(3+1)*4"
    val queue = inFixToPostFix(string)

    val resultQueue: Queue<String> = LinkedList(queue)
    while (resultQueue.isNotEmpty()) {
        print("${resultQueue.poll()} ")
    }

    println()
    println(evalPostFix(queue))

}

fun inFixToPostFix(string: String): Queue<String> {
    val output: Queue<String> = LinkedList()
    val stack: Stack<Char> = Stack()

    val replace = mapOf(
        '+' to 1,
        '-' to 1,
        '*' to 2,
        '/' to 2,
        '(' to 0,
        ')' to 0
    )

    var i = 0
    while (i<string.length){
        val token = string[i]
        when {
            token.isDigit() -> {
                var num = ""
                while (i<string.length && string[i].isDigit()) {
                    num += string[i]
                    i++
                }
                output.add(num)
                continue
            }
            token=='(' -> stack.push(token)
            token==')' -> {
                while (stack.isNotEmpty() && stack.peek() != '(') {
                    output.add(stack.pop().toString())
                }
                stack.pop()
            }

            //연산자
            token in replace.keys -> {
                while (stack.isNotEmpty() &&
                    (replace[stack.peek()] ?: 0) >= (replace[token] ?: 0)
                ){
                    output.add(stack.pop().toString())
                }
                stack.push(token)
            }
        }
        i++
    }
    while (stack.isNotEmpty()){
        output.add(stack.pop().toString())
    }
    return output
}

fun evalPostFix(postFix: Queue<String>): Int {
    val stack = Stack<Int>()

    while (postFix.isNotEmpty()) {
        val token = postFix.poll()

        val number = token.toIntOrNull()
        if (number != null) {
            stack.push(number)
        } else {
            val sec = stack.pop()
            val fir = stack.pop()

            val result = when (token) {
                "+" -> fir + sec
                "-" -> fir - sec
                "*" -> fir * sec
                "/" -> fir / sec
                else -> throw IllegalArgumentException()
            }
            stack.push(result)
        }
    }
    return stack.pop()
}