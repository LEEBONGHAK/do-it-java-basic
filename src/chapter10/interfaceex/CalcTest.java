package chapter10.interfaceex;

public class CalcTest {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;

        Calc calc1 = new CompleteCalc();
        System.out.println(calc1.add(num1, num2));
        System.out.println(calc1.div(num1, num2));

        Calculator calc2 = new CompleteCalc();
        CompleteCalc calc3 = new CompleteCalc();
        calc3.showInfo();
    }
}
