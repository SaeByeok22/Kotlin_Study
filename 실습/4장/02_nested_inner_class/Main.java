
public class Main {

    static class Outer {
        private final String text;

        public Outer(String text) {
            this.text = text;
        }

        static class Nested {
            public void printMessage() {
                System.out.println("Nested 클래스");
            }
        }

        class Inner {
            public void printOuterText() {
                System.out.println(text);
            }
        }
    }

    public static void main(String[] args) {
        Outer.Nested nested = new Outer.Nested();
        nested.printMessage();

        Outer outer = new Outer("Outer 클래스");
        Outer.Inner inner = outer.new Inner();
        inner.printOuterText();
    }
}