package exercise.chapter_37;

public interface FamilyRole extends DaddyRole, HusbandRole{
    // I/F에서 I/F 상속 가능(여러 I/F 1개의 I/F로 관리시 사용)
    @Override
    default void sayLoveEveryday() {
        // 메소드 명 동일시, 각 인터페이스별 메소드 지정하여 각각 실행 가능
        DaddyRole.super.sayLoveEveryday();
        HusbandRole.super.sayLoveEveryday();
    }
}
