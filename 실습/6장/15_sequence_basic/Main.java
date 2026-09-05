import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> result = IntStream.rangeClosed(1, 100)
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .limit(5)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}