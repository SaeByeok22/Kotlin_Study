public class Main {

    public static char lastChar(String text) {
        return text.charAt(text.length() - 1);
    }

    public static void main(String[] args) {
        String text = "Java";

        System.out.println(lastChar(text));
    }
}