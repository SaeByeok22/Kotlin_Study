public class Main {

    interface Clickable {
        void click();

        default void showMessage() {
            System.out.println("클릭되었습니다.");
        }
    }

    static class Button implements Clickable {
        @Override
        public void click() {
            System.out.println("버튼 클릭");
        }
    }

    static class SubmitButton extends Button {
        @Override
        public void click() {
            System.out.println("제출 버튼 클릭");
        }
    }

    public static void main(String[] args) {
        SubmitButton button = new SubmitButton();

        button.click();
        button.showMessage();
    }
}