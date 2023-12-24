package exercise.chapter_21;

import java.util.Arrays;

public class ArrayCopy2 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] arr1 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        // 해당 방식 가장 자주 사용
        int[] arr3 = arr.clone();

        arr[0] = 100;
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));
        System.out.println("arr3 = " + Arrays.toString(arr3));
    }
}
