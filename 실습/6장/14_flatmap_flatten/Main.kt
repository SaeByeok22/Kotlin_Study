fun main() {
    val nestedNumbers = listOf(
        listOf(1, 2),
        listOf(3, 4)
    )

    val flattened = nestedNumbers.flatten()

    val words = listOf("Kotlin", "Java")

    val characters = words.flatMap {
        it.toList()
    }

    println(flattened)
    println(characters)
}