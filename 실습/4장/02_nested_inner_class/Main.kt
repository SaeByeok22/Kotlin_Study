class Outer(
    private val text: String
) {
    class Nested {
        fun printMessage() {
            println("Nested 클래스")
        }
    }

    inner class Inner {
        fun printOuterText() {
            println(text)
        }
    }
}

fun main() {
    val nested = Outer.Nested()
    nested.printMessage()

    val outer = Outer("Outer 클래스")
    val inner = outer.Inner()
    inner.printOuterText()
}