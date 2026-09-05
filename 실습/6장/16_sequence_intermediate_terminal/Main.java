import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> stream = IntStream.rangeClosed(1, 10)
                .boxed()
                .filter(number -> {
                    System.out.println("filter: " + number);
                    return number % 2 == 0;
                })
                .map(number -> {
                    System.out.println("map: " + number);
                    return number * 10;
                });

        System.out.println("아직 계산되지 않음");

        List<Integer> result = stream.collect(Collectors.toList());

        System.out.println("결과: " + result);
    }
}