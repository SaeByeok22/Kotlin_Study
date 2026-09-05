public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        builder.append("Hello");
        builder.append(" ");
        builder.append("Java");

        String result = builder.toString();

        System.out.println(result);
    }
}