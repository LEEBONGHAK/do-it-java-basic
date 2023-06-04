package chapter11.string;

public class StringBuilderTest {
    public static void main(String[] args) {
        String str = new String("java");
        System.out.println(System.identityHashCode(str));

        StringBuilder buffer = new StringBuilder(str);
        System.out.println(System.identityHashCode(buffer));

        buffer.append(" and");
        buffer.append(" android");
        System.out.println(System.identityHashCode(buffer));

        String str2 = buffer.toString();
        System.out.println(str2);
    }
}
