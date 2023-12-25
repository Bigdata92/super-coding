package exercise.chapter_33;

public class AnimalDownCasting {

    public static void main(String[] args) {
        // Down casting check
        Animal animal = new Bird();
        checkBirdAndFly(animal);

        // Down casting error
        Animal animal2 = new Animal();
//        Bird bird2 = (Bird) animal2;
        checkBirdAndFly(animal2);

        Animal animal3 = new Person();
        checkBirdAndFly(animal3);
    }

    static void checkBirdAndFly(Animal animal) {
        if (animal instanceof Animal) {
            System.out.println("aaaa");     // Bird, Person 객체는 Animal 자손이므로 Animal instanceof 이다.
        }
        if (animal instanceof Bird) {
            Bird bird = (Bird) animal;
            bird.fly();
        } else {
            System.out.println("This animal is NOT BIRD instance");
        }
    }
}
