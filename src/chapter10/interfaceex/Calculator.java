package chapter10.interfaceex;

// 타입 상속 (Type Inheritance)
// - 인터페이스를 상속 받는 것을 말함
// - 여러 개의 인터페이스를 상속 가능하다.
public abstract class Calculator implements Calc, Runnable {
    @Override
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public int sub(int x, int y) {
        return x - y;
    }
}
