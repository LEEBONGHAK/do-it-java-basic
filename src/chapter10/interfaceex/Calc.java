package chapter10.interfaceex;

/**
 * 인터페이스 (Interface)
 * - 모든 메서드가 추상 메서드 (abstract method) 로 이루어진 클래스
 * - 형식적인 선언만 있고 구현은 없음
 * - pre-compile 단계에서 인터페이스에 선언된 모든 멤버 변수는 public static final 키워드가 추가되어 상수화
 * - pre-compile 단계에서 인터페이스에 선언된 메서드의 경우 public abstract 키워드가 추가되어 추상 메서드화
 */
public interface Calc {
    double PI = 3.14;
    int ERROR = -99999999;

    int add(int x, int y);
    int sub(int x, int y);
    int mul(int x, int y);
    int div(int x, int y);

}
