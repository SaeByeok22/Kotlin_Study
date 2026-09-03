infix fun Int.times(value: Int): Int {
    return this * value
}

fun main() {
    val result = 10 times 20
    println(result)

    val pair = "Kotlin" to 2024
    val (language, year) = pair

    println(language)
    println(year)
}