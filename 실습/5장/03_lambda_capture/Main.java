import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        AtomicInteger count = new AtomicInteger(0);

        Runnable increase = () -> {
            count.incrementAndGet();
        };

        increase.run();
        increase.run();
        increase.run();

        System.out.println("count: " + count.get());
    }
}