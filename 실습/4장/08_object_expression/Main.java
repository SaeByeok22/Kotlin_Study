import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Comparator<String> comparator = new Comparator<>() {
            @Override
            public int compare(String a, String b) {
                return a.length() - b.length();
            }
        };

        int result = comparator.compare("Kotlin", "Java");

        System.out.println(result);
    }
}