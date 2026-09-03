fun greet(
    name: String,
    message: String = "안녕하세요"
) {
    println("$message, $name")
}

fun main() {
    greet(name = "철수")
    greet(
        name = "영희",
        message = "반갑습니다"
    )
}