package chapter5.method;

public class FunctionTest {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;

        int sum = addNum(num1, num2);
        System.out.println(sum);
    }

    public static int addNum(int n1, int n2) {
        return n1 + n2;
    }
}
