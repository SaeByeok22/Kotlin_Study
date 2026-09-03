fun String.lastChar(): Char {
    return this[lastIndex]
}

fun main() {
    val text = "Kotlin"

    println(text.lastChar())
}