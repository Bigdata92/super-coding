package exercise.chapter_20;

public class ArrayFor {
    public static void main(String[] args) {
        int[] studentScores = {90, 87, 88, 75, 99, 65};

        // for loop
        for (int i = 0; i < studentScores.length; i++) {
            System.out.printf("studentScores index : %d, value : %d%n", i, studentScores[i]);
        }
        for (int score: studentScores) {
            System.out.println("student score = " + score);
        }
    }
}
