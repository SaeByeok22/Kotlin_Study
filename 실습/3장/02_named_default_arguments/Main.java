public class Main {

    public static void greet(String name, String message) {
        System.out.println(message + ", " + name);
    }

    public static void greet(String name) {
        greet(name, "안녕하세요");
    }

    public static void main(String[] args) {
        greet("철수");
        greet("영희", "반갑습니다");
    }
}