public class Main {

    public static int parseNumber(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(parseNumber("123"));
        System.out.println(parseNumber("abc"));
    }
}