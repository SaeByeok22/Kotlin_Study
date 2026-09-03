fun sum(vararg numbers: Int): Int {
    return numbers.sum()
}

fun main() {
    val numbers = intArrayOf(1, 2, 3)

    println(sum(10, 20, 30))
    println(sum(*numbers))
}