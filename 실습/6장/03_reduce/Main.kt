fun main() {
    val numbers = listOf(1, 2, 3, 4)

    val sum = numbers.reduce { total, number ->
        total + number
    }

    println(sum)
}