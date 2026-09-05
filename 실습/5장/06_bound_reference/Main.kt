class Printer {
    fun print(message: String) {
        println(message)
    }
}

fun main() {
    val printer = Printer()

    val printMessage = printer::print

    printMessage("Kotlin 바운드 멤버 참조")
}