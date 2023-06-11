package chapter13.lambdaexpression;

interface PrintString {
    void showString(String str);
}

public class LambdaTest {
    public static void main(String[] args) {
        // 인터페이스형 변수에 람다식 대입
        PrintString lambdaPrint = str -> System.out.println(str);
        lambdaPrint.showString("test1");

        // 매개변수로 전달하는 람다식
        showMyString(lambdaPrint);

        // 반환 값으로 쓰이는 람다식
        PrintString reStr = returnPrint();
        reStr.showString("hello");
    }

    public static void showMyString(PrintString lambda) {
        lambda.showString("test2");
    }

    public static PrintString returnPrint() {
        return s -> System.out.println(s + " world");
    }
}
