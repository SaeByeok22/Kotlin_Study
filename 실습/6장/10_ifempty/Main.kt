fun main() {
    val names = emptyList<String>()

    val result = names.ifEmpty {
        listOf("이름 없음")
    }

    println(result)
}