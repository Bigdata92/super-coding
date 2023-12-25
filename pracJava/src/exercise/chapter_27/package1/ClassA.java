package exercise.chapter_27.package1;

public class ClassA {
    // Public
    public String publicStr;
    // Private
    private String privateStr;
    // Default
    String defaultStr;

    public void methodPublic(){};
    private void methodPrivate(){};
    void methodDefault(){};

    void testPrivate(ClassA classA) {
        String str = classA.privateStr;
        classA.methodPrivate();
    }

    void testDefault(ClassA classA) {
        String str = classA.defaultStr;
        classA.methodDefault();
    }
}
