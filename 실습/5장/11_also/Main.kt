fun main() {
    val numbers = mutableListOf(1, 2, 3)
        .also {
            println("생성된 리스트: $it")
        }

    numbers.add(4)

    println("변경된 리스트: $numbers")
}