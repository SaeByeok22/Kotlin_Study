fun main() {
    val numbers = listOf(1, 2, 3)

    val doubledNumbers = numbers.map {
        it * 2
    }

    println(doubledNumbers)
}