package exercise.chapter_47;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceTest {
    public static void main(String[] args) {

        // Map 정의
        Map<String, Integer> fruitMap = new HashMap<>();

        // Map에 data들을 넣음
        fruitMap.put("Orange", 5);
        fruitMap.put("Apple", 10);
        fruitMap.put("Banana", 3);
        fruitMap.put("Kiwi", 20);

        System.out.println("fruitMap = " + fruitMap);

        // Get(key)
        Integer appleCount = fruitMap.get("Apple");
        Integer bananaCount = fruitMap.get("Banana");

        System.out.println("appleCount = " + appleCount);
        System.out.println("bananaCount = " + bananaCount);

        // contains(Key)
        boolean isApple = fruitMap.containsKey("Apple");
        boolean isMango = fruitMap.containsKey("Mango");

        System.out.println("isApple = " + isApple);
        System.out.println("isMango = " + isMango);

        // remove(key)
        fruitMap.remove("Apple");
        System.out.println("fruitMap = " + fruitMap);

        int size = fruitMap.size();
        System.out.println("size = " + size);

        // keySet()
        System.out.println(fruitMap.keySet());
    }
}
