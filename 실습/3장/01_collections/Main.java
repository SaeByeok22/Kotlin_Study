import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);

        List<Integer> mutableNumbers = new java.util.ArrayList<>(
                Arrays.asList(1, 2, 3)
        );

        mutableNumbers.add(4);

        Map<String, Integer> scores = new HashMap<>();
        scores.put("철수", 90);
        scores.put("영희", 85);

        System.out.println(numbers);
        System.out.println(mutableNumbers);

        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(
                    entry.getKey() + ": " + entry.getValue()
            );
        }
    }
}