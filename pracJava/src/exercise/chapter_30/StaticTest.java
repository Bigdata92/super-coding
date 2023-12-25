package exercise.chapter_30;

public class StaticTest {
    public static void main(String[] args) {
        // class variable
        int num = Student.serialNum;
        String city = Student.city;
        System.out.println("num = " + num);
        System.out.println("city = " + city);

        // 4명 만들기
        Student student1 = new Student("Alice", "Female");
        Student student2 = new Student("Tom", "Male");
        Student student3 = new Student("Taylor", "Female");
        Student student4 = new Student("Mike", "Male");

        int num4 = student4.serialNum;

        student1.printMyInfo();
        student2.printMyInfo();
        student3.printMyInfo();
        student4.printMyInfo();
        System.out.println("num4 = " + num4);
    }
}
