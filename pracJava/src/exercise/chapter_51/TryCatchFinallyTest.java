package exercise.chapter_51;

public class TryCatchFinallyTest {
    public static void main(String[] args) {

        System.out.println("메인 메소드 시작");
        try {
            Integer myInt = null;
            Integer data = 100 / myInt;

            if (myInt == 14) {
                return;
            }

            String str = null;
            System.out.println(str.toUpperCase());
            System.out.println("data = " + data);

        } catch (ArithmeticException e) {
            System.out.println("myInt는 0이 될 수 X");
            e.printStackTrace();
        } finally {
            System.out.println("여기는 무조건 실행되는 Finally 블록 입니다.");
        }

//        catch (ArithmeticException | NullPointerException e) {
//            System.out.println("ArithmeticException or NullPointerException 발생");
//            e.printStackTrace();
//        }

        System.out.println("메인 메소드 종료");
    }
}
