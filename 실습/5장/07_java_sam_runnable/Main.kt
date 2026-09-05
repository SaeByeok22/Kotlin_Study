fun postponeComputation(
    delay: Long,
    computation: Runnable
) {
    Thread.sleep(delay)
    computation.run()
}

fun main() {
    postponeComputation(1000) {
        println("1초 후 실행된 Kotlin 작업")
    }
}