object Logger {
    fun log(message: String) {
        println("[LOG] $message")
    }
}

class User private constructor(
    val name: String
) {
    companion object {
        fun create(name: String): User {
            return User(name)
        }
    }
}

fun main() {
    Logger.log("프로그램 시작")

    val user = User.create("철수")
    println(user.name)
}