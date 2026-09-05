fun main() {
    var count = 0

    val increase = {
        count++
    }

    increase()
    increase()
    increase()

    println("count: $count")
}