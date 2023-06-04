package chapter10.interfaceex;

// 구현 상속 (Implement Inheritance)
// - 일반적인 상속을 말함
// - 단 하나의 클래스만 상속 받을 수 있음
public class CompleteCalc extends Calculator {
    @Override
    public int mul(int x, int y) {
        return x * y;
    }

    @Override
    public int div(int x, int y) {
        if ( y != 0) {
            return x / y;
        }

        return ERROR;
    }

    @Override
    public void run() {
        System.out.println("RUN!!");
    }

    public void showInfo() {
        System.out.println("Calc 인터페이스를 구현하였습니다.");
    }
}
