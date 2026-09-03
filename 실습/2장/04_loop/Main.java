import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("1부터 5까지");

        for (int number = 1; number <= 5; number++) {
            System.out.println(number);
        }

        System.out.println("5부터 1까지");

        for (int number = 5; number >= 1; number--) {
            System.out.println(number);
        }

        System.out.println("점수 목록");

        List<Integer> scores = Arrays.asList(70, 85, 100);

        for (int score : scores) {
            System.out.println(score);
        }

        int count = 0;

        while (count < 3) {
            System.out.println("while: " + count);
            count++;
        }
    }
}