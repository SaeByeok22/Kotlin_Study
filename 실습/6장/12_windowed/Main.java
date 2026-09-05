import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5);

        List<List<Integer>> windows = new ArrayList<>();

        for (int index = 0; index <= numbers.size() - 3; index++) {
            windows.add(numbers.subList(index, index + 3));
        }

        System.out.println(windows);
    }
}