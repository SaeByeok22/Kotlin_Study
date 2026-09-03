fun main() {
    val comparator = object : Comparator<String> {
        override fun compare(a: String, b: String): Int {
            return a.length - b.length
        }
    }

    val result = comparator.compare("Kotlin", "Java")

    println(result)
}