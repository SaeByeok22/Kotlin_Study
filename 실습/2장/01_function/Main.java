public class Main {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        final String name = "Java";
        int count = 1;

        count = 2;

        System.out.println("언어: " + name);
        System.out.println("count: " + count);
        System.out.println("합계: " + add(10, 20));
    }
}