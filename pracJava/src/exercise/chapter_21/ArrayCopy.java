package exercise.chapter_21;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        // int copy
        int a = 5;
        int b = a;
        b += 5;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // array copy
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = arr1;

        arr1[0] = 10;

        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));
    }
}
