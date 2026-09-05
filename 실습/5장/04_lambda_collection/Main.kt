data class Person(
    val name: String,
    val age: Int
)

fun main() {
    val people = listOf(
        Person("철수", 17),
        Person("영희", 20),
        Person("민수", 25)
    )

    val adultNames = people
        .filter { it.age >= 20 }
        .map { it.name }

    println(adultNames)
}