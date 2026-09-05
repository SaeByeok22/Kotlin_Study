fun main() {
    val numbers = listOf(1, 2, 3, 4)

    val sum = numbers.fold(100) { total, number ->
        total + number
    }

    println(sum)
}