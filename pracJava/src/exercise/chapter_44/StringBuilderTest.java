package exercise.chapter_44;

public class StringBuilderTest {
    public static void main(String[] args) {
        // +=
        String str = "";

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 50000; i++) {
            str += "Cat";
        }
//        System.out.println(str);

        long endTime = System.currentTimeMillis();
        long execTime = endTime - startTime;
        System.out.println("걸린 시간 : " + execTime);

        long startTime2 = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 50000; i++) {
            sb.append("Cat");
        }

//        System.out.println(sb);

        long endTime2 = System.currentTimeMillis();
        long execTime2 = endTime2 - startTime2;
        System.out.println("걸린 시간 : " + execTime2);
    }
}
