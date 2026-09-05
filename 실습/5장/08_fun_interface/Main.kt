fun interface ClickListener {
    fun onClick()
}

fun registerListener(listener: ClickListener) {
    listener.onClick()
}

fun main() {
    registerListener {
        println("Kotlin 클릭 이벤트")
    }
}