package chapter3.StringAdt

interface MyString {
    fun MyString():String
    fun SubStr(fir:Int, sec:Int): MyString?
    fun IsEmpty():Boolean
    fun IsEqual(str:String):Boolean
    fun Length():Int

    fun Insert(str: MyString, index: Int): MyString
    fun concat(str: MyString): MyString
    fun find(str: MyString): Int?
}