package exercise.chapter_37;

public abstract class FamilyMan implements FamilyRole {
    // 추상 class에서 method 오버라이딩 방식으로 많이 사용(I/F default method 보다는)
    protected String name;

    @Override
    public void educateBaby(Baby baby) {
        String name = baby.getName();
        System.out.println(name + " 아기를 열심히 교육하고 있습니다.");
    }

    @Override
    public void takeCareWife(Wife wife) {
        String name = wife.getName();
        System.out.println(name + " 인 아내를 성심성의껏 케어합니다.");
    }
}
