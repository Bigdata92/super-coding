package exercise.chapter_44;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Customer customer = new Customer("민철");
        Class clazz = customer.getClass();
//        Class clazz2 = Customer.class;

//        Constructor[] constructors = clazz.getConstructors();
//        for (Constructor constructor: constructors) {
//            System.out.println("constructor = " + constructor);
//        }
//        System.out.println("============================================");
//
//        Method[] methods = clazz.getMethods();
//        for (Method method: methods) {
//            System.out.println("method = " + method);
//        }
//        System.out.println("============================================");

        Field[] fields = clazz.getFields();
//        Class[] declaredClasses = clazz.getDeclaredClasses();     // public 아니여도 출력
//        for (Field field: fields) {
//            // public 만 출력 가능
//            System.out.println("field = " + field);
//        }

        Customer customer2 = (Customer) clazz.getConstructor(String.class).newInstance("민철");
        System.out.println("customer2 = " + customer2);
    }
}
