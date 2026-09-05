import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static class Person {
        private final String name;

        Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("철수"),
                new Person("영희")
        );

        List<String> names = people.stream()
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println(names);
    }
}