package exercise.chapter_15;

public class Literal {
    public static void main(String[] args) {
        int num = 0b1010;   // 2진법
        System.out.println("num = " + num);

        int num2 = 0xAC0;   // 16진법
        System.out.println("num2 = " + num2);

        double myDouble = 5.22E5;
        System.out.println("myDouble = " + myDouble);

        double myDouble2 = 2.55E-3;
        System.out.println("myDouble2 = " + myDouble2);

        String str1 = null;     // reference type
        System.out.println("str1 = " + str1);
    }
}
