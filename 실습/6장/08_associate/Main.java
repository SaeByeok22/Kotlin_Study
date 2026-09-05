import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
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

        @Override
        public String toString() {
            return name + "(" + age + ")";
        }
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("철수", 20),
                new Person("영희", 21)
        );

        Map<String, Person> peopleByName =
                people.stream().collect(
                        Collectors.toMap(
                                Person::getName,
                                Function.identity()
                        )
                );

        Map<String, Integer> nameToAge =
                people.stream().collect(
                        Collectors.toMap(
                                Person::getName,
                                Person::getAge
                        )
                );

        System.out.println(peopleByName);
        System.out.println(nameToAge);
    }
}