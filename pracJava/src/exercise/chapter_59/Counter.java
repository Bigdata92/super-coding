package exercise.chapter_59;

public class Counter {
    private int count = 0;

    // synchronized: 동기화
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
