enum class Grade {
    A, B, C, F
}

fun getMessage(grade: Grade): String {
    return when (grade) {
        Grade.A -> "아주 잘했습니다."
        Grade.B -> "잘했습니다."
        Grade.C -> "조금 더 노력하세요."
        Grade.F -> "재시험이 필요합니다."
    }
}

fun main() {
    val grade = Grade.B

    println("등급: $grade")
    println(getMessage(grade))
}