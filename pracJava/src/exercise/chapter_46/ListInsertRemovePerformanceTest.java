package exercise.chapter_46;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInsertRemovePerformanceTest {
    static final int SIZE = 1000;

    public static void main(String[] args) {

        long startTime;
        long endTime;

        startTime = System.currentTimeMillis();

        // List ArrayList 구현
        List<Integer> integerList1 = new ArrayList<>();

        for (int i = 0; i < SIZE; i++) {
            integerList1.add(i);
            if (i % 5 == 0) {
                integerList1.remove(0);
            }
        }

        endTime = System.currentTimeMillis();

        System.out.println("ArrayList 삽입/삭제 요청 걸린 시간 : " + (endTime - startTime));

        List<Integer> integerList2 = new LinkedList<>();

        startTime = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            integerList2.add(i);
            if (i % 5 == 0) {
                integerList2.remove(0);
            }
        }
        endTime = System.currentTimeMillis();

        System.out.println("integerList1 = " + integerList1);
        System.out.println("integerList2 = " + integerList2);

        System.out.println("LinkedList 삽입/삭제 요청 걸린 시간 : " + (endTime - startTime));

    }
}
