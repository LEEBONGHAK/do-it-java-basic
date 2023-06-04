package chapter9.template;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();

    // 훅 메서드 (Hook Method)
    // - 구현 코드가 없지만, 필요에 의해 재정의하여 사용하는 메서드
    public void washCar() {};

    public void startCar() {
        System.out.println("시동을 틉니다");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    /**
     * 템플릿 메서드 (Template Method)
     * - 추상 메서드나 구현된 메서드를 활용해 전체 기능의 흐름(시나리오)을 정의하는 메서드
     * - final 키워드를 선언하면 하위 클래스에서 재정의 할 수 없음
     * - 프레임 워크에서 많이 사용되는 설계 패턴
     * - 추상 클래스로 선언된 상위 클래스에 템플릿 메서드를 활용하여 전체적인 흐름을 정의하고 하위 클래스에서 다르게 구현되어야 하는 부분은 추상 메서드로 선언해 하위 클래스가 구현하도록 함
     * - 템플릿 메서드는 하위 클래스에서 overriding 할 수 없다.
     */
    public final void run() {
        startCar();
        drive();
        wiper();
        stop();
        washCar();
        turnOff();
    }
}
