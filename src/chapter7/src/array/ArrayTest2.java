package chapter7.src.array;

public class ArrayTest2 {
    public static void main(String[] args) {
        double[] num = new double[5];
        num[0] = 10.0;
        num[1] = 20.0;
        num[2] = 30.0;

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
