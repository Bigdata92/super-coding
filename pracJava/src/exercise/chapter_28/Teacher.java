package exercise.chapter_28;

public class Teacher {

    // 학교 정보
    private String schoolName;

    // 과목
    private Subject subject;

    // 기본 정보
    private String name;
    private String gender;

    // 행위
    void teach(Student student, String subjectName) {
        // TODO : 나중에 구현
        String studentName = student.getName();
        System.out.printf("선생님 : 저는 %s 에게 %s 과목을 가르치고 있습니다.\n", studentName, subjectName);
    }

    Teacher() {

    }

    Teacher(String name, String gender, String subjectName, String subjectCode) {
        this.name = name;
        this.gender = gender;

        Subject newSubject = new Subject();
        newSubject.setSubjectName(subjectName);
        newSubject.setSubjectCode(subjectCode);
    }

    // getter
    public String getName() {
        return name;
    }
}
