package chapter4.hanoi

abstract class hanoi {
    abstract fun Push(push: Char)
    abstract fun Pop(index: Int): Char?
    abstract fun Print()
    abstract fun moveDisk(n:Int, from: Int, temp:Int, to:Int)
}