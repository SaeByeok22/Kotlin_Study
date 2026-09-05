import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    static class Person {
        private final String name;
        private final int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
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
                new Person("영희", 20),
                new Person("민수", 25)
        );

        Map<Integer, List<Person>> peopleByAge =
                people.stream().collect(
                        Collectors.groupingBy(Person::getAge)
                );

        System.out.println(peopleByAge);
    }
}