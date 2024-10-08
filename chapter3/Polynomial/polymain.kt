package chapter3.Polynomial

fun main(){
    val p1 = PolynomialImpl()

    p1.NewTerm(1f,0)
    p1.NewTerm(1.5f, 1)
    p1.NewTerm(2f,2)

    p1.print()

    println(p1.Eval(0.0f))
    println(p1.Eval(1.0f))
    println(p1.Eval(2.0f))


    val p2 = PolynomialImpl()
    p2.NewTerm(1f,1)
    p2.NewTerm(3f,2)

    p2.print()

    val p3 = p1.Add(p2)
    p3.print()

    val p4 = p1.Mult(p2)
    p4.print()
}