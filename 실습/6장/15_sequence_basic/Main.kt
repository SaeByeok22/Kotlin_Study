fun main() {
    val result = (1..100)
        .asSequence()
        .filter { it % 2 == 0 }
        .map { it * 2 }
        .take(5)
        .toList()

    println(result)
}