interface Clickable {
    fun click()

    fun showMessage() {
        println("클릭되었습니다.")
    }
}

open class Button : Clickable {
    override fun click() {
        println("버튼 클릭")
    }
}

class SubmitButton : Button() {
    override fun click() {
        println("제출 버튼 클릭")
    }
}

fun main() {
    val button = SubmitButton()

    button.click()
    button.showMessage()
}