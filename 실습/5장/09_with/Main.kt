fun main() {
    val result = with(StringBuilder()) {
        append("Hello")
        append(" ")
        append("Kotlin")

        toString()
    }

    println(result)
}