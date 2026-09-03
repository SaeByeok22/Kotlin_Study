fun main() {
    val text = """
        Kotlin
        Java
        Python
    """.trimIndent()

    println(text)

    val regex = """\d+""".toRegex()

    println(regex.matches("123"))
    println(regex.matches("abc"))
}