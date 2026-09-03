import java.util.Objects;

public class Main {

    static class User {
        private final String name;
        private final int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public User copy(String name, int age) {
            return new User(name, age);
        }

        @Override
        public String toString() {
            return "User{name='" + name + "', age=" + age + "}";
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }

            if (!(object instanceof User)) {
                return false;
            }

            User user = (User) object;

            return age == user.age
                    && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        User user = new User("철수", 20);
        User updatedUser = user.copy("철수", 21);

        System.out.println(user);
        System.out.println(updatedUser);

        System.out.println(updatedUser.getName());
        System.out.println(updatedUser.getAge());
    }
}