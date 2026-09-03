data class User(
    val name: String,
    val age: Int
)

fun main() {
    val user = User("철수", 20)
    val updatedUser = user.copy(age = 21)

    println(user)
    println(updatedUser)

    val (name, age) = updatedUser

    println(name)
    println(age)
}