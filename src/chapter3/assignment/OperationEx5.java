package chapter3.assignment;

public class OperationEx5 {
    public static void main(String[] args) {
        int num1 = 5;   // 0b101
        int num2 = 10;  // 0b1010

        System.out.println(num1 & num2);    // 0b0000
        System.out.println(num1 | num2);    // 0b1111

        int num3 = 5;   // 0b101
        System.out.println(num3 << 1);  // 0b1010
        System.out.println(num3 << 2);  // 0b10100
        System.out.println(num3 << 3);  // 0b101000
        System.out.println(num3 >> 1);  // 0b10
    }
}
