data class Person(
    val name: String
)

fun main() {
    val people = listOf(
        Person("철수"),
        Person("영희")
    )

    val names = people.map(Person::name)

    println(names)
}