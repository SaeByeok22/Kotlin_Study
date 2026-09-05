import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> nestedNumbers = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4)
        );

        List<Integer> flattened = nestedNumbers.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        List<String> words = Arrays.asList("Java", "Kotlin");

        List<String> characters = words.stream()
                .flatMap(word -> Arrays.stream(word.split("")))
                .collect(Collectors.toList());

        System.out.println(flattened);
        System.out.println(characters);
    }
}