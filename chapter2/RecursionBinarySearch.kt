package chapter2

fun main(){
    val list = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println(recursionBinarySearch(list, 0, list.size-1, 4))

}

fun recursionBinarySearch(list: MutableList<Int>, left: Int, right: Int, find: Int): Int{
    if(left<=right){
        var middle = (left+right)/2

        return if (find<list[middle])
            recursionBinarySearch(list, left, middle-1, find)
        else if (find>list[middle])
            recursionBinarySearch(list, middle+1, right, find)
        else
            middle
    }
    return -1
}