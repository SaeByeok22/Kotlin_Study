import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        );

        List<List<Integer>> chunks = new ArrayList<>();

        for (int index = 0; index < numbers.size(); index += 3) {
            int end = Math.min(index + 3, numbers.size());

            chunks.add(numbers.subList(index, end));
        }

        System.out.println(chunks);
    }
}