package exercise.chapter_24;

public class Scores {
    public static void main(String[] args) {

        int studentAClass1 = 50;
        int studentAClass2 = 30;
        int studentAClass3 = 45;

        int studentBClass1 = 60;
        int studentBClass2 = 65;
        int studentBClass3 = 66;

        double averageAClass = calculateAverage(studentAClass1, studentAClass2, studentAClass3);
        double averageBClass = calculateAverage(studentBClass1, studentBClass2, studentBClass3);

        System.out.println("averageAClass = " + averageAClass);
        System.out.println("averageBClass = " + averageBClass);
    }

    static double calculateAverage(int score1, int score2, int score3) {
        int sum = score1 + score2 + score3;
        return sum / (double) 3;
    }
}
