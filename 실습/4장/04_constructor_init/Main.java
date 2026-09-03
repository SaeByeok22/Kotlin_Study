public class Main {

    static class User {
        private final String name;
        private int age;

        public User(String name) {
            this.name = name;
            System.out.println(name + " 사용자 생성");
        }

        public User(String name, int age) {
            this(name);
            setAge(age);
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age < 0) {
                throw new IllegalArgumentException(
                        "나이는 음수일 수 없습니다."
                );
            }

            this.age = age;
        }
    }

    public static void main(String[] args) {
        User user = new User("철수", 20);

        System.out.println(user.getName());
        System.out.println(user.getAge());
    }
}