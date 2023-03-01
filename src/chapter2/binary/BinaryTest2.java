package chapter2.binary;

public class BinaryTest2 {
    public static void main(String[] args) {
        int num1 = 0b00000000000000000000000000000101;  // 5
        int num2 = 0b11111111111111111111111111111011;  // -5

        int sum = num1 + num2;  // 0

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(sum);
    }
}
