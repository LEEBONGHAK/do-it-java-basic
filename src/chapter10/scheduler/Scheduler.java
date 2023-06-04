package chapter10.scheduler;

/**
 * 인터페이스의 요소
 * - 상수: 모든 변수는 상수로 변환
 * - 추상 메서드: 모든 메서드는 추상 메서드로 구성
 * - 디폴트 메서드: 기본 구현을 가지는 메서드, 구현 클래스에서 재정의 할 수 있음
 * - 정적 메서드: 인스턴스 생성과 상관 없이 인터페이스 타입으로 사용할 수 있는 메서드
 * - private 메서드: 인터페이스를 구현한 클래스에서 사용하거나 재정의 할 수 없음. 인터페이스 내부에서만 기능을 제공하기 위해 구현하는 메서드
 */
public interface Scheduler {
    void getNextCall();
    void sendCallToAgent();
}
