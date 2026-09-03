public class Main {

    public static void printUser(String name, int age) {
        validate(name, age);
        System.out.println(name + ", " + age);
    }

    private static void validate(String name, int age) {
        if (name.isBlank()) {
            throw new IllegalArgumentException(
                    "이름은 비어 있을 수 없습니다."
            );
        }

        if (age < 0) {
            throw new IllegalArgumentException(
                    "나이는 음수일 수 없습니다."
            );
        }
    }

    public static void main(String[] args) {
        printUser("철수", 20);
    }
}