import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 7);

        System.out.println(
                "all: " + numbers.stream().allMatch(n -> n > 0)
        );
        System.out.println(
                "any: " + numbers.stream().anyMatch(n -> n % 2 != 0)
        );
        System.out.println(
                "none: " + numbers.stream().noneMatch(n -> n < 0)
        );
        System.out.println(
                "count: " + numbers.stream()
                        .filter(n -> n % 2 == 0)
                        .count()
        );
        System.out.println(
                "find: " + numbers.stream()
                        .filter(n -> n > 5)
                        .findFirst()
                        .orElse(null)
        );
    }
}