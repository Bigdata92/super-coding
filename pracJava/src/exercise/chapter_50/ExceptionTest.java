package exercise.chapter_50;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("메인 메소드 시작");

        makeUncheckException();
        makeCheckException();

        System.out.println("메인 메소드 종료");
    }

    public static void makeUncheckException() {
        int[] intArr = {1,2,3,4,5,6,7,8,9,10};
        int index = 10;

        System.out.println("intArr = " + intArr[index]);
    }

    public static void makeCheckException() throws FileNotFoundException {
        File file = new File("D:\\workspace\\super-coding\\pracJava\\src\\exercise\\chapter_50\\test.txt");
        FileInputStream fs = new FileInputStream(file);

        System.out.println("FS 실행");
    }
}
