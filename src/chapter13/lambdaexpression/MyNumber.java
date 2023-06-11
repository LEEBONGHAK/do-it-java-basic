package chapter13.lambdaexpression;

@FunctionalInterface
public interface MyNumber {
    // 람다식을 위한 인터페이스에는 하나의 메서드만을 가질 수 있다.
    int getMaxNumber(int num1, int num2);
}
