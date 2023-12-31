package exercise.chapter_50;

public class TryCatchTest1 {
    public static void main(String[] args) {
        System.out.println("메인 메소드 실행");

        try {
            int i = 0;
            int data = 50 / i;

            System.out.println("data = " + data);
        } catch (ArithmeticException e) {
            System.out.println("0으로는 나눌 수 X");
            System.out.println("data = " + 0);
        }

        // 중요 로직
        System.out.println("메인 메소드 종료");
    }
}
