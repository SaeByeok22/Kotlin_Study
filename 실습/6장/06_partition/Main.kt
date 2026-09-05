fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    val (evenNumbers, oddNumbers) = numbers.partition {
        it % 2 == 0
    }

    println("짝수: $evenNumbers")
    println("홀수: $oddNumbers")
}