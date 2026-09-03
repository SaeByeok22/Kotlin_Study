public class Main {

    enum Grade {
        A, B, C, F
    }

    public static String getMessage(Grade grade) {
        switch (grade) {
            case A:
                return "아주 잘했습니다.";
            case B:
                return "잘했습니다.";
            case C:
                return "조금 더 노력하세요.";
            case F:
                return "재시험이 필요합니다.";
            default:
                return "알 수 없는 등급입니다.";
        }
    }

    public static void main(String[] args) {
        Grade grade = Grade.B;

        System.out.println("등급: " + grade);
        System.out.println(getMessage(grade));
    }
}