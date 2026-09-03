fun parseNumber(text: String): Int {
    return try {
        text.toInt()
    } catch (e: NumberFormatException) {
        0
    }
}

fun main() {
    println(parseNumber("123"))
    println(parseNumber("abc"))
}