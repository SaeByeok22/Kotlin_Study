fun printUser(name: String, age: Int) {
    fun validate() {
        require(name.isNotBlank()) {
            "이름은 비어 있을 수 없습니다."
        }

        require(age >= 0) {
            "나이는 음수일 수 없습니다."
        }
    }

    validate()
    println("$name, $age")
}

fun main() {
    printUser("철수", 20)
}