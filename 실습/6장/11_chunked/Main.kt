fun main() {
    val numbers = (1..10).toList()

    val chunks = numbers.chunked(3)

    println(chunks)
}