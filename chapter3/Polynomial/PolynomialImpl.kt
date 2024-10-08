package chapter3.Polynomial

import kotlin.math.pow

class PolynomialImpl(private val max_degree: Int = 100) : Polynomial() {
    val terms = Array<Terms?>(max_degree) { null }

    override fun Polynomial(): Polynomial {
        return this
    }

    override fun MaxDegree(): Int {
        return terms.filterNotNull().maxOfOrNull { it.exp } ?: 0
    }

    override fun NewTerm(coef: Float, exp: Int) {
        //이미있으면 계수 더하기
        if (terms[exp] != null) {
            terms[exp] = Terms(terms[exp]!!.coef + coef, exp)
        } else {
            terms[exp] = Terms(coef, exp)
        }
    }

    override fun Eval(x: Float): Float {
        return terms.filterNotNull().fold(0f) { sum, term ->
            sum + term.coef * x.toDouble().pow(term.exp.toDouble()).toFloat()
        }
    }

    override fun print() {
        val term = terms.filterNotNull()
        for (i in term.indices) {
            print("+ ${term[i].coef} * x^${term[i].exp}")
        }
        println()
    }
}

fun Polynomial.Add(poly: Polynomial): Polynomial {
    val add = PolynomialImpl()

    //현재
    val current = this as PolynomialImpl
    current.terms.filterNotNull().forEach { term ->
        add.NewTerm(term.coef, term.exp)
    }

    val new = poly as PolynomialImpl
    new.terms.filterNotNull().forEach { term ->
        add.NewTerm(term.coef, term.exp)
    }
    return add
}

fun Polynomial.Mult(poly: Polynomial): Polynomial {
    val mult = PolynomialImpl()

    val current = this as PolynomialImpl
    val new = poly as PolynomialImpl
    current.terms.filterNotNull().forEach { term1 ->
        new.terms.filterNotNull().forEach { term2 ->
            val newCoef = term1.coef * term2.coef
            val newExp = term1.exp + term2.exp
            mult.NewTerm(newCoef, newExp)
        }
    }
    return mult
}