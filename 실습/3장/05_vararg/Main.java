public class Main {

    public static int sum(int... numbers) {
        int result = 0;

        for (int number : numbers) {
            result += number;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        System.out.println(sum(10, 20, 30));
        System.out.println(sum(numbers));
    }
}