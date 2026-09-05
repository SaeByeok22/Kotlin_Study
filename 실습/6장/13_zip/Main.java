import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names =
                Arrays.asList("철수", "영희", "민수");

        List<Integer> scores =
                Arrays.asList(90, 85, 100);

        List<String> results = new ArrayList<>();

        for (int index = 0; index < names.size(); index++) {
            results.add(
                    "(" + names.get(index)
                            + ", " + scores.get(index) + ")"
            );
        }

        System.out.println(results);
    }
}