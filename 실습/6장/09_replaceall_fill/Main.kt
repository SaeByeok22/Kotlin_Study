fun main() {
    val numbers = mutableListOf(1, 2, 3)

    numbers.replaceAll {
        it * 10
    }

    println(numbers)

    numbers.fill(0)

    println(numbers)
}