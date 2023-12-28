package exercise.chapter_36;

public abstract class Animal {  // 추상클래스로 변환
    // 속성
    protected String gender;

    // 행위
    // 추상class에서는 body x
    public abstract void eat(String food);

    public abstract void sleep();
}
