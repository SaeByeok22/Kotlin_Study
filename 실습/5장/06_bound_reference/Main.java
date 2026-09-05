import java.util.function.Consumer;

public class Main {
    static class Printer {
        public void print(String message) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        Printer printer = new Printer();

        Consumer<String> printMessage = printer::print;

        printMessage.accept("Java 바운드 멤버 참조");
    }
}