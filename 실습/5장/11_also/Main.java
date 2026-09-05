import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(1, 2, 3)
        );

        System.out.println("생성된 리스트: " + numbers);

        numbers.add(4);

        System.out.println("변경된 리스트: " + numbers);
    }
}