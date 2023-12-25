package exercise.chapter_27.package2;

import exercise.chapter_27.package1.ClassA;

public class ClassB {
    void testPublic(ClassA classA) {
        String str = classA.publicStr;
        classA.methodPublic();
    }

//    void testPrivate(ClassA classA) {
//        String str = classA.privateStr;
//        classA.methodPrivate();
//    }
//
//    void testDefault(ClassA classA) {
//        String str = classA.defaultStr;
//        classA.methodDefault();
//    }
}
