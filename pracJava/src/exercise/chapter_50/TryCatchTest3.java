package exercise.chapter_50;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchTest3 {
    public static void main(String[] args) {
        System.out.println("메인 메소드 실행");

        try {
            FileInputStream fs = new FileInputStream("pracJava/src/exercise/chapter_50/test.txt");

            int i;
            while ((i = fs.read()) != -1) {
                System.out.write(i);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File 찾을 수 X");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("입출력 과정에서 문제 발생");
            e.printStackTrace();
        }


        // 중요 로직
        System.out.println("메인 메소드 종료");
    }
}
