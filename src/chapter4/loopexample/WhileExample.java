package chapter4.loopexample;

public class WhileExample {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while (num <= 10) {
            sum += num;
            num++;
        }
        System.out.println(sum);

        num = 1;
        sum = 0;

        do {
            sum += num;
            num++;
        } while (num < 1);
        System.out.println(sum);
    }
}
