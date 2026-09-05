import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static class Person {
        private final String name;
        private final int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("철수", 17),
                new Person("영희", 20),
                new Person("민수", 25)
        );

        List<String> adultNames = people.stream()
                .filter(person -> person.getAge() >= 20)
                .map(person -> person.getName())
                .collect(Collectors.toList());

        System.out.println(adultNames);
    }
}