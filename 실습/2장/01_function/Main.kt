fun add(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    val name = "Kotlin"
    var count = 1

    count = 2

    println("언어: $name")
    println("count: $count")
    println("합계: ${add(10, 20)}")
}