package exercise.chapter_28;

public class Student {
    // 속성
    String schoolName;
    int classYear;  // 몇 학년
    int classRoomNumber;    // 몇 반
    int studentNumber;    // 몇 번

    // 기본 정보
    String name;
    String gender;

    // 행위
    void study(Teacher teacher, String subjectName) {

        String teacherName = teacher.getName();
        System.out.printf("학생 : 저는 %s 선생님에게 %s 과목을 배웁니다.\n", teacherName, subjectName);
    }

    // 생성자
    Student() {

    };

    Student(String name, String gender) {
        // this() : Student(String schoolName, int classYear, int classroomNum, int studentNum, String name, String gender) {
        this("school", 1, 3, -1, name, gender);
    };

    Student(String schoolName, int classYear, int classroomNum, int studentNum, String name, String gender) {
        this.schoolName = schoolName;
        this.classYear = classYear;
        this.classRoomNumber = classroomNum;
        this.studentNumber = studentNum;
        this.name = name;
        this.gender = gender;
    }

    // getter
    public String getName() {
        return name;
    }
}
