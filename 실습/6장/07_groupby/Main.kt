data class Person(
    val name: String,
    val age: Int
)

fun main() {
    val people = listOf(
        Person("철수", 20),
        Person("영희", 20),
        Person("민수", 25)
    )

    val peopleByAge = people.groupBy {
        it.age
    }

    println(peopleByAge)
}