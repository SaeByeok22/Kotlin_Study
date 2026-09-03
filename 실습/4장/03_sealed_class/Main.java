public class Main {

    static abstract class Result {
        static class Success extends Result {
            private final String data;

            public Success(String data) {
                this.data = data;
            }
        }

        static class Error extends Result {
            private final String message;

            public Error(String message) {
                this.message = message;
            }
        }
    }

    public static String handle(Result result) {
        if (result instanceof Result.Success) {
            Result.Success success = (Result.Success) result;
            return "성공: " + success.data;
        }

        if (result instanceof Result.Error) {
            Result.Error error = (Result.Error) result;
            return "실패: " + error.message;
        }

        return "알 수 없는 결과";
    }

    public static void main(String[] args) {
        System.out.println(
                handle(new Result.Success("데이터 저장 완료"))
        );

        System.out.println(
                handle(new Result.Error("저장 실패"))
        );
    }
}