package exercise.chapter_47;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Objects;

public class HashTest {
    public static String hashString(String input) {
        try {
            // MessageDigest 인스턴스 생성 (해시 알고리즘으로 SHA-256 선택)
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // 입력 문자열을 바이트 배열로 변환하여 해시 함수에 전달
            byte[] hashBytes = digest.digest(input.getBytes(StandardCharsets.UTF_8));

            // Base64로 인코딩하여 해시된 문자열 반환
            return Base64.getEncoder().encodeToString(hashBytes);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String password = "q1w2e3r4t5";
        String hassPassword = hashString(password);

        System.out.println("password = " + password);
        System.out.println("hassPassword = " + hassPassword);

        // Data 검색을 위한 Hash
        int hashCode = Objects.hashCode(password);
        int hashCode2 = Objects.hashCode(2244);
        int hashCode3 = Objects.hashCode(new Customer("민철"));
        int hashCode4 = Objects.hashCode(new VIPCustomer("아이유 "));

        System.out.println("hashCode = " + hashCode);
        System.out.println("hashCode2 = " + hashCode2);
        System.out.println("hashCode3 = " + hashCode3);
        System.out.println("hashCode4 = " + hashCode4);

        Customer customer1 = new Customer("ID1", "민철");
        Customer customer2  = new Customer("ID1", "민철");

        int hashCodeCustomer1 = Objects.hashCode(customer1);
        int hashCodeCustomer2 = Objects.hashCode(customer2);

        System.out.println("hashCodeCustomer1 = " + hashCodeCustomer1);
        System.out.println("hashCodeCustomer2 = " + hashCodeCustomer2);
    }
}
