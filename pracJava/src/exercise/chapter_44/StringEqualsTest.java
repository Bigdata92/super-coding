package exercise.chapter_44;

public class StringEqualsTest {
    public static void main(String[] args) {

        String str1 = "Cat";    // Constant Pool에서 생성
        String str2 = "Cat";

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String str3 = new String("Cat");    // Heap에서 생성
        String str4 = new String("Cat");

        System.out.println(str3 == str4);   // 주소가 다름
        System.out.println(str3.equals(str4));  // 값 동일

        System.out.println(str3 == str1);   // 주소가 다름
        System.out.println(str3.equals(str1));  // 값 동일
    }
}
