interface Printer {
    fun print()
}

class ConsolePrinter : Printer {
    override fun print() {
        println("출력합니다.")
    }
}

class PrinterWrapper(
    printer: Printer
) : Printer by printer

fun main() {
    val printer = PrinterWrapper(ConsolePrinter())

    printer.print()
}