package exercise.chapter_36;

public interface Flyable {

    long atmosphereLimit = 476;     // 대기권

    // default method(구현 안해주어도 가능)
    default void fly(){
        System.out.println("<정보> 현재 이 사물은 날고 있습니다.");
    };

    static void printLanding() {
        System.out.println("<정보> 현재 이 사물은 공중에 있습니다.");
    }
}
