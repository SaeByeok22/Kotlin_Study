public class Main {
    @FunctionalInterface
    interface ClickListener {
        void onClick();
    }

    public static void registerListener(
            ClickListener listener
    ) {
        listener.onClick();
    }

    public static void main(String[] args) {
        registerListener(() -> {
            System.out.println("Java 클릭 이벤트");
        });
    }
}