package letcode

import java.lang.StringBuilder

fun main() {

    println(reverseWords("Jalil Boynazarov"))
}

fun reverseWords(s: String): String {
    val arr = s.split(" ")
    val str = StringBuilder()

    arr.onEachIndexed {index, s->
        str.append(s.reversed())
        if (index != arr.size-1)
        str.append(" ")
    }
    return str.toString()
}