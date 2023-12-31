package exercise.chapter_45;

public class WrapperClassTest {

    public static void main(String[] args) {

        // Integer
        Integer integer1 = new Integer(20);     // int -> Integer boxing
        Integer integer2 = new Integer(30);

        int int1 = integer1.intValue();     // Integer -> int unboxing

        Integer integer3 = 20;  // AutoBoxing
        int int2 = integer3;    // AutoUnboxing

        System.out.println("integer1 = " + integer1);
        System.out.println("int1 = " + int1);
        System.out.println("integer2 = " + integer2);
        System.out.println("integer3 = " + integer3);
        System.out.println("int2 = " + int2);

        // 연산자
        System.out.println(integer1 + integer2);
        System.out.println(integer1 + int1);

        // Character
        Character character = new Character('X');   // 'X' CharType -> Character Boxing
        char ch1 = character.charValue();   // Character -> 'X' CharType UnBoxing

        Character character1 = ch1;
        char ch2 = character1;

        System.out.println("character = " + character);
        System.out.println("ch1 = " + ch1);

        Character[] characters = {'a', 'b', 'c'};
        char[] chars = {'a', 'b', 'c'};

        String str = String.valueOf(characters);
        String str2 = String.valueOf(chars);

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        // Boolean Type
        Boolean boolean1 = new Boolean(true);   // true boolean -> Boolean
        boolean b1 = boolean1.booleanValue();

        Boolean boolean2 = false;
        boolean b2 = boolean2;

        System.out.println(boolean1 & boolean2);
        System.out.println(boolean1 | boolean2);
    }
}
