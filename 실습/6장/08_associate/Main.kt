data class Person(
    val name: String,
    val age: Int
)

fun main() {
    val people = listOf(
        Person("철수", 20),
        Person("영희", 21)
    )

    val peopleByName = people.associateBy {
        it.name
    }

    val nameToAge = people.associate {
        it.name to it.age
    }

    println(peopleByName)
    println(nameToAge)
}