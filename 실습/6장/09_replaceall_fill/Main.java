import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(1, 2, 3)
        );

        numbers.replaceAll(number -> number * 10);

        System.out.println(numbers);

        Collections.fill(numbers, 0);

        System.out.println(numbers);
    }
}