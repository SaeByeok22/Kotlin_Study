fun main() {
    val numbers = listOf(1, 2, 3)
    val mutableNumbers = mutableListOf(1, 2, 3)

    mutableNumbers.add(4)

    val scores = mapOf(
        "철수" to 90,
        "영희" to 85
    )

    println(numbers)
    println(mutableNumbers)

    for ((name, score) in scores) {
        println("$name: $score")
    }
}