package chapter11.string;

public class StringTest {
    public static void main(String[] args) {
        String str1 = new String("test");
        String str2 = new String("test");
        System.out.println(str1 == str2);

        String str3 = "test";
        String str4 = "test";
        System.out.println(str3 == str4);

        String str5 = new String("java");
        System.out.println(System.identityHashCode(str5));
        String str6 = new String("android");
        str5 = str5.concat(str6);
        System.out.println(str5);
        System.out.println(System.identityHashCode(str5));
    }
}
