sealed class Result {
    class Success(val data: String) : Result()
    class Error(val message: String) : Result()
}

fun handle(result: Result): String {
    return when (result) {
        is Result.Success -> "성공: ${result.data}"
        is Result.Error -> "실패: ${result.message}"
    }
}

fun main() {
    println(handle(Result.Success("데이터 저장 완료")))
    println(handle(Result.Error("저장 실패")))
}