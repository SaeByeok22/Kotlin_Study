import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        int sum = numbers.stream()
                .reduce((total, number) -> total + number)
                .orElse(0);

        System.out.println(sum);
    }
}