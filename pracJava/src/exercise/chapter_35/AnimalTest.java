package exercise.chapter_35;

public class AnimalTest {

    public static void main(String[] args) {
//        Animal animal = new Animal();     // 추상class는 인스턴스 생성 X
        Animal animal2 = new Bird();
        Animal animal3 = new Fish();
        Animal animal4 = new Person();
        Animal animal5 = new Dog();

//        feed(animal, "뺴뺴로");
        feed(animal2, "벌레");
        feed(animal3, "모이");
        feed(animal4, "김밥");
        feed(animal5, "고기");
    }

    public static void feed(Animal animal, String food) {
        animal.eat(food);
    }
}
