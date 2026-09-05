fun main() {
    val numbers = listOf(2, 4, 6, 7)

    println("all: ${numbers.all { it > 0 }}")
    println("any: ${numbers.any { it % 2 != 0 }}")
    println("none: ${numbers.none { it < 0 }}")
    println("count: ${numbers.count { it % 2 == 0 }}")
    println("find: ${numbers.find { it > 5 }}")
}