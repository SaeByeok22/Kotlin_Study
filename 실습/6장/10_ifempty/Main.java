import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Collections.emptyList();

        List<String> result;

        if (names.isEmpty()) {
            result = Collections.singletonList("이름 없음");
        } else {
            result = names;
        }

        System.out.println(result);
    }
}