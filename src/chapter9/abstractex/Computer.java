package chapter9.abstractex;


/*
* 추상 클래스(abstract class)
* - 추상 메서드를 포함한 클래스
* - 상속을 위한 클래스
* - 인스턴스 생성(new)를 할 수 없다.
* */
public abstract class Computer {
    public abstract void display();
    public abstract void typing();

    public void turnOn() {
        System.out.println("전원을 킵니다.");
    }

    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }
}
