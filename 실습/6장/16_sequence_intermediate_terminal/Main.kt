fun main() {
    val sequence = (1..10)
        .asSequence()
        .filter {
            println("filter: $it")
            it % 2 == 0
        }
        .map {
            println("map: $it")
            it * 10
        }

    println("아직 계산되지 않음")

    val result = sequence.toList()

    println("결과: $result")
}