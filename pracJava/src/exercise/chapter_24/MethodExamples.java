package exercise.chapter_24;

public class MethodExamples {

    // 입력 O, 출력 O
    static int toUnicode(char ch) {
        return (int) ch;
    }

    static int sumAndMultiplyFour(int a, int b) {
        return (a + b) * 4;
    }

    public static void main(String[] args) {
        char ch = 'A';
        int decode = toUnicode(ch);
        System.out.println("decode = " + decode);

        int myInt1 = 10;
        int myInt2 = 5;
        int result = sumAndMultiplyFour(myInt1, myInt2);
        System.out.println("result = " + result);

        String res = sayHello();
        System.out.println("res = " + res);

        printHello("printHello");
        printHi();
    }

    // 입력 X, 출력 O
    static String sayHello() {
        return "Hello";
    }

    // 입력 O, 출력 X
    static void printHello(String str) {
        System.out.printf("함수 안에서 실행 %s\n", str);
    }

    // 입력 X, 출력 X
    static void printHi() {
        System.out.println("Hi");
    }
}
