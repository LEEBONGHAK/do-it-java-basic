package chapter11.classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class strClass = Class.forName("java.lang.String");

        // 생성자 정보 보기
        Constructor[] cons = strClass.getConstructors();
        for (Constructor c : cons) {
            System.out.println(c);
        }

        System.out.println("===================");

        // 멤버변수 정보 보기
        Field[] fields = strClass.getFields();
        for (Field f : fields) {
            System.out.println(f);
        }

        System.out.println("===================");

        // 메서드 정보 보기
        Method[] methods = strClass.getMethods();
        for (Method m : methods) {
            System.out.println(m);
        }
    }
}
