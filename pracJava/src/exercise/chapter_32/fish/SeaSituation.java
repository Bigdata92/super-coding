package exercise.chapter_32.fish;

public class SeaSituation {
    public static void main(String[] args) {

//        // 자식 물고기
//        FishChild fishChild = new FishChild();
//        fishChild.setSex("Male");
//        fishChild.setEatable(true);
//        fishChild.setLeavingSea("동해");
//
//        fishChild.printMyInfo();
//
//        // 생성자 오버로딩
//        FishChild fishChild2 = new FishChild("Female", true, "서해");
//        fishChild2.printMyInfo();

        // 자식 물고기 생성
//        FishChild fishChild3 = new FishChild(true, "서해");
//        fishChild3.printMyInfo();
        // 결과 leavingSea='null' (부모가 아닌 자식 leavingSea 수정해서)

        // 자식 물고기 생성
//        FishChild fishChild = new FishChild();
//        fishChild.setLeavingSea("동해");
//        fishChild.setLeavingSeaChild("서해");
//        fishChild.printSea();

        // 핵심 타입 s
        // 타입 선언: 부모, 인스턴스화: 부모
        // 타입 선언: 부모, 인스턴스화: 자식
        // 타입 선언: 자식, 인스턴스화: 자식
        // 타입 선언: 자식, 인스턴스화: 부모
        Fish fish1 = new Fish();
        fish1.eat("새우");

        Fish fish2 = new FishChild();
        fish2.eat("새우");

        FishChild fish3 = new FishChild();
        fish3.eat("새우");

        // 에러
//        FishChild fish4 = new Fish();
//        fish4.eat("새우");

    }
}
