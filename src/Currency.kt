class Currency {
}

fun main() {

    println("123209404".toCurrencyFormat())
}
fun String.toCurrencyFormat(): String {
    /**
     *  this is for Only Int
     * */
    val str = StringBuilder()
    val size = this.length
    val array = this.toCharArray()
    for (i in size - 1 downTo 0) {
        str.append(array[size - i - 1])
        if (i != 0 && (size - 1 - (size - 1 - i)) % 3 == 0) {
            str.append(" ")
        }
    }
    return str.toString().trim()
}