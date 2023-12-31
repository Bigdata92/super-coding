package exercise.chapter_47;

import java.util.*;

public class SetInterfaceTest {
    public static void main(String[] args) {

        // Set 정의
        Set<String> fruitSet = new HashSet<>();
        List<String> fruitList = new ArrayList<>();

        // add
        fruitSet.add("Orange");
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Kiwi");

        fruitList.add("Orange");
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Kiwi");

        System.out.println("fruitSet = " + fruitSet);

        // add 중복 Add X

        fruitSet.add("Apple");
        fruitList.add("Apple");
        System.out.println("fruitSet = " + fruitSet);
        System.out.println("fruitList = " + fruitList);

        // remove(set)
        fruitSet.remove("Apple");
        System.out.println("fruitSet = " + fruitSet);

        // container
        System.out.println("Apple 유무 : " + fruitSet.contains("Apple"));
        System.out.println("Apple1 유무 : " + fruitSet.contains("Apple1"));

        // Size, isEmpty, Clear
        int size = fruitSet.size();
        System.out.println("size = " + size);

        fruitSet.clear();
        System.out.println("fruitSet = " + fruitSet.isEmpty());
        System.out.println("fruitSet = " + fruitSet);

    }
}
