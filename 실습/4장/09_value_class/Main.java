public class Main {

    static class UserId {
        private final String value;

        public UserId(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public static void findUser(UserId id) {
        System.out.println("사용자 ID: " + id.getValue());
    }

    public static void main(String[] args) {
        UserId id = new UserId("user-001");

        findUser(id);
    }
}