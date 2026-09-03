fun main() {
    println("1부터 5까지")

    for (number in 1..5) {
        println(number)
    }

    println("5부터 1까지")

    for (number in 5 downTo 1) {
        println(number)
    }

    println("점수 목록")

    val scores = listOf(70, 85, 100)

    for (score in scores) {
        println(score)
    }

    var count = 0

    while (count < 3) {
        println("while: $count")
        count++
    }
}