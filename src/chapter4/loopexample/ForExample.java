package chapter4.loopexample;

public class ForExample {
    public static void main(String[] args) {
        int num;
        int sum = 0;

        for (num = 1; num <= 10; num++) {
            sum += num;
        }
        System.out.println(num);
        System.out.println(sum);

        for (num = 1, sum = 0; num <= 10; num++) {
            sum += num;
        }
        System.out.println(num);
        System.out.println(sum);
    }
}
