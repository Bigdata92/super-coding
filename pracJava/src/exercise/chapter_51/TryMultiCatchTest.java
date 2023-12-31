package exercise.chapter_51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryMultiCatchTest {
    public static void main(String[] args) {

        System.out.println("메인 메소드 시작");
        try {
            FileInputStream fs = new FileInputStream("pracJava/src/exercise/chapter_51/test.txt");
            int i = 0;
            int data = 100 / i;

            String str = null;
            System.out.println(str.toUpperCase());

            int index = 5;
            int[] intArr = new int[10];
            System.out.println(intArr[index]);

        } catch (FileNotFoundException e) {
            System.out.println("File을 찾을 수 X");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("최종 Exception");
        }

//        catch (ArithmeticException | NullPointerException e) {
//            System.out.println("ArithmeticException or NullPointerException 발생");
//            e.printStackTrace();
//        }

        System.out.println("메인 메소드 종료");
    }
}
