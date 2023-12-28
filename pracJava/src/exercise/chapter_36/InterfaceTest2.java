package exercise.chapter_36;

public class InterfaceTest2 {
    public static void main(String[] args) {

        // Flyable
        Flyable drone = new Drone();
        Flyable airplane = new Airplane("AB112");

        drone.fly();
        airplane.fly();

        if (drone instanceof Drone) {
            Drone drone2 = (Drone) drone;
            drone2.takePicture();
        }
    }
}
