public class Main {
    static class User {
        private String name;
        private int age;

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "User(name=" + name + ", age=" + age + ")";
        }
    }

    public static void main(String[] args) {
        User user = new User();

        user.setName("철수");
        user.setAge(20);

        System.out.println(user);
    }
}