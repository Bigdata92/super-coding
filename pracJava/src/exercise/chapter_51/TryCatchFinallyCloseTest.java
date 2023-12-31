package exercise.chapter_51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchFinallyCloseTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("메인 메소드 실행");

        try (FileInputStream fs = new FileInputStream("pracJava/src/exercise/chapter_51/test.txt");){

            int i;
            while ((i = fs.read()) != -1) {
                System.out.write(i);
            }

            int myInt = 10;
            int data = 100 / myInt;

        } catch (FileNotFoundException e) {
            System.out.println("File 찾을 수 X");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("입출력 과정에서 문제 발생");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 X");
        }


        // 중요 로직
        System.out.println("메인 메소드 종료");

        while (true) {
            Thread.sleep(1000);
        }
    }
}
