package chapter10.interfaceex;

/**
 * 인터페이스 (Interface)
 * - 모든 메서드가 추상 메서드 (abstract method) 로 이루어진 클래스
 * - 형식적인 선언만 있고 구현은 없음
 * - pre-compile 단계에서 인터페이스에 선언된 모든 멤버 변수는 public static final 키워드가 추가되어 상수화
 * - pre-compile 단계에서 인터페이스에 선언된 메서드의 경우 public abstract 키워드가 추가되어 추상 메서드화
 */
/*
 * 인터페이스의 요소
 * - 상수: 모든 변수는 상수로 변환
 * - 추상 메서드 (abstract method) : 모든 메서드는 추상 메서드로 구성
 * - 디폴트 메서드 (default method) : 기본 구현을 가지는 메서드, 구현 클래스에서 재정의 할 수 있음
 * - 정적 메서드 (static method) : 인스턴스 생성과 상관 없이 인터페이스 타입으로 사용할 수 있는 메서드
 * - private 메서드: 인터페이스를 구현한 클래스에서 사용하거나 재정의 할 수 없음. 인터페이스 내부에서만 기능을 제공하기 위해 구현하는 메서드
 */
public interface Calc {
    double PI = 3.14;
    int ERROR = -99999999;

    int add(int x, int y);
    int sub(int x, int y);
    int mul(int x, int y);
    int div(int x, int y);

    /**
     * 디폴트 메서드 (default method)
     * - 기본 구현을 가지는 메서드, 구현 클래스에서 재정의 할 수 있음
     */
    default void description() {
        System.out.println("정수 계산기를 구현합니다.");
    }

    /**
     * 정적 메서드 (static method)
     * - 인스턴스 생성과 상관 없이 인터페이스 타입으로 사용할 수 있는 메서드
     */
    static int total(int[] arr) {
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    /**
     * private 메서드
     * - 인터페이스를 구현한 클래스에서 사용하거나 재정의 할 수 없음. 인터페이스 내부에서만 기능을 제공하기 위해 구현하는 메서드
     */
    // default method 에서 사용되는 private method
    private void myMethod() {};

    // static method 에서 사용되는 private method
    static private void myStaticMethod() {};
}
