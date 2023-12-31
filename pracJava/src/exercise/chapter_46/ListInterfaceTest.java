package exercise.chapter_46;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceTest {
    public static void main(String[] args) {

        // List 정의
        List<String> fruitList = new ArrayList<>();

        // add
        fruitList.add("Orange");
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Kiwi");

        System.out.println("fruitList = " + fruitList);

        // add(index, element)
        fruitList.add(3, "Mango");

        System.out.println("fruitList = " + fruitList);

        // remove(index)
        fruitList.remove(3);

        System.out.println("fruitList = " + fruitList);

        // get(index)
        String myFruit = fruitList.get(3);
        System.out.println("myFruit = " + myFruit);

        // set(index. element)
        fruitList.set(1, "PineApple");
        System.out.println("fruitList = " + fruitList);

        // size
        System.out.println("fruitList size = " + fruitList.size());

        // isEmpty : List empty 유무
        List<String> fruitList2 = new ArrayList<>();
        System.out.println("fruitList2.isEmpty() = " + fruitList2.isEmpty());
        System.out.println("fruitList.isEmpty() = " + fruitList.isEmpty());

        // Contains : List에 해당 원소 있는지 유무 확인 메소드
        System.out.println("fruitList = " + fruitList.contains("Kiwi"));
        System.out.println("fruitList = " + fruitList.contains("Apple"));

        // IndexOf, Clear
        String myFruit2 = "Orange";
        System.out.println(fruitList.indexOf(myFruit2));
        String myFruit3 = "Apple";
        System.out.println(fruitList.indexOf(myFruit3));

        fruitList.clear();
        System.out.println("fruitList = " + fruitList);
    }
}
