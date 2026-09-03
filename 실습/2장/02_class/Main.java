public class Main {

    static class Person {
        private final String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public boolean isAdult() {
            return age >= 20;
        }
    }

    public static void main(String[] args) {
        Person person = new Person("민수", 25);

        System.out.println("이름: " + person.getName());
        System.out.println("나이: " + person.getAge());
        System.out.println("성인 여부: " + person.isAdult());

        person.setAge(26);
        System.out.println("변경된 나이: " + person.getAge());
    }
}