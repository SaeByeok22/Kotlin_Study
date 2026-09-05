class User {
    var name: String = ""
    var age: Int = 0

    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }
}

fun main() {
    val user = User().apply {
        name = "철수"
        age = 20
    }

    println(user)
}