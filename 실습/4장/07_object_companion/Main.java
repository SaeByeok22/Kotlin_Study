public class Main {

    static class Logger {
        private static final Logger INSTANCE = new Logger();

        private Logger() {
        }

        public static Logger getInstance() {
            return INSTANCE;
        }

        public void log(String message) {
            System.out.println("[LOG] " + message);
        }
    }

    static class User {
        private final String name;

        private User(String name) {
            this.name = name;
        }

        public static User create(String name) {
            return new User(name);
        }
    }

    public static void main(String[] args) {
        Logger.getInstance().log("프로그램 시작");

        User user = User.create("철수");
        System.out.println(user.name);
    }
}