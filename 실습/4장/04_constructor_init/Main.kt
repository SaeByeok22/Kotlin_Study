class User(
    val name: String
) {
    var age: Int = 0
        set(value) {
            require(value >= 0) {
                "나이는 음수일 수 없습니다."
            }
            field = value
        }

    init {
        println("$name 사용자 생성")
    }

    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }
}

fun main() {
    val user = User("철수", 20)

    println(user.name)
    println(user.age)
}