@JvmInline
value class UserId(
    val value: String
)

fun findUser(id: UserId) {
    println("사용자 ID: ${id.value}")
}

fun main() {
    val id = UserId("user-001")

    findUser(id)
}