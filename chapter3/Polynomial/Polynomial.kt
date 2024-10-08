package chapter3.Polynomial

abstract class Polynomial() {
    abstract fun Polynomial(): Polynomial
    abstract fun MaxDegree(): Int
    abstract fun NewTerm(coef: Float, exp: Int)
    abstract fun Eval(x: Float): Float
    abstract fun print()
}
