public class Main {
    public static void postponeComputation(
            long delay,
            Runnable computation
    ) throws InterruptedException {
        Thread.sleep(delay);
        computation.run();
    }

    public static void main(String[] args)
            throws InterruptedException {

        postponeComputation(1000, () -> {
            System.out.println("1초 후 실행된 Java 작업");
        });
    }
}