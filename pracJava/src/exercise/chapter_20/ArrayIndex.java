package exercise.chapter_20;

import java.util.Arrays;

public class ArrayIndex {
    public static void main(String[] args) {
        // index get
        int[] studentScores = {90, 87, 88, 75, 99, 65};
        int score1 = studentScores[0];
        System.out.println("score1 = " + score1);

        studentScores[2] = 93;
        System.out.println("studentScores = " + Arrays.toString(studentScores));

        // Error
        int score6 = studentScores[6];
        System.out.println("score6 = " + score6);
    }
}
