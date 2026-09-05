fun main() {
    val numbers = (1..5).toList()

    val windows = numbers.windowed(3)

    println(windows)
}