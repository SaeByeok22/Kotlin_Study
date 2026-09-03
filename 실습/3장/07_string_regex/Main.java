import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String text = "Kotlin\nJava\nPython";

        System.out.println(text);

        Pattern regex = Pattern.compile("\\d+");

        System.out.println(regex.matcher("123").matches());
        System.out.println(regex.matcher("abc").matches());
    }
}