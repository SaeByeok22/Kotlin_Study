class Person(
    val name: String,
    var age: Int
) {
    val adult: Boolean
        get() = age >= 20
}

fun main() {
    val person = Person("민수", 25)

    println("이름: ${person.name}")
    println("나이: ${person.age}")
    println("성인 여부: ${person.adult}")

    person.age = 26
    println("변경된 나이: ${person.age}")
}