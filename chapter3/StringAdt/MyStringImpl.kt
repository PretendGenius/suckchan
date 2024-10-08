package chapter3.StringAdt

class MyStringImpl(private val myString: String = "") : MyString {

    override fun MyString(): String = myString

    override fun SubStr(fir: Int, sec: Int): MyString? {
        var s = ""
        for(i in fir-1 until  fir+sec) {
            s +=myString[i]
        }
        return MyStringImpl(s)
    }

    override fun IsEmpty(): Boolean = myString.isEmpty()

    override fun IsEqual(str: String): Boolean = myString == str

    override fun Length(): Int = myString.length

    override fun Insert(str: MyString, index: Int): MyString {
        for (i in myString.indices) {
            if (i == index) {
                return MyStringImpl(StringBuilder(myString).insert(index, str.MyString()).toString())
            }
        }
        return this
    }

    override fun concat(str: MyString): MyString {
        return MyStringImpl(myString + str.MyString())
    }

    override fun find(str: MyString): Int? {
        for (i in 0..Length() - str.Length()) {
            for (j in 0 until str.Length()) {
                if (myString[i + j] != str.MyString()[j]) break
                if (j == str.Length() - 1) return i
            }
        }
        return null
    }
}