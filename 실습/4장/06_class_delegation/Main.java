public class Main {

    interface Printer {
        void print();
    }

    static class ConsolePrinter implements Printer {
        @Override
        public void print() {
            System.out.println("출력합니다.");
        }
    }

    static class PrinterWrapper implements Printer {
        private final Printer printer;

        public PrinterWrapper(Printer printer) {
            this.printer = printer;
        }

        @Override
        public void print() {
            printer.print();
        }
    }

    public static void main(String[] args) {
        Printer printer = new PrinterWrapper(
                new ConsolePrinter()
        );

        printer.print();
    }
}