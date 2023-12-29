package exercise.chapter_39;

import exercise.chapter_33.Person;

public class AnimalDownCasting {

    public static void main(String[] args) {
        // Down casting check
        Animal animal = new Bird();

        // runtime error
        animal = null;
        animal.sleep();
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
