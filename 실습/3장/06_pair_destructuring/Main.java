public class Main {

    static class Pair {
        private final String language;
        private final int year;

        public Pair(String language, int year) {
            this.language = language;
            this.year = year;
        }

        public String getLanguage() {
            return language;
        }

        public int getYear() {
            return year;
        }
    }

    public static void main(String[] args) {
        int result = 10 * 20;
        System.out.println(result);

        Pair pair = new Pair("Java", 2024);

        System.out.println(pair.getLanguage());
        System.out.println(pair.getYear());
    }
}