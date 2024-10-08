package chapter3.StringAdt

fun main(){
    val myString = MyStringImpl("hi hay he hel hello llo ello el el o!")

    println(myString.IsEmpty())
    println(myString.IsEqual("hi hay he hel hello llo ello el el o!"))
    println(myString.Length())

    val a = MyStringImpl("ads")
    val s = MyStringImpl("hay")
    println(myString.Insert(a,1).MyString())
    println( myString.concat(a).MyString())
    println( myString.find(s))
    println(myString.SubStr(4,6)?.MyString())
}