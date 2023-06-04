package chapter11.classex;

import java.lang.reflect.InvocationTargetException;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
//        Class c
        String str = new String("test");

        Person person = new Person();
        Class pClass = person.getClass();
        System.out.println(pClass);

        Class pClass2 = Person.class;
        System.out.println(pClass2);

        Class pClass3 = Class.forName("chapter11.classex.Person");
        System.out.println(pClass3);

        Class sClass = Class.forName("java.lang.String");
        System.out.println(sClass);

        System.out.println("===================");

        Person p = new Person();

        Class pClass4 = Class.forName("chapter11.classex.Person");
        Person p2 = (Person) pClass4.getDeclaredConstructor().newInstance();

        System.out.println(p);
        System.out.println(p2);
    }
}
