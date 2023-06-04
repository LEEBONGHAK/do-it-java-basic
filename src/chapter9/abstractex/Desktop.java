package chapter9.abstractex;

// 추상 클래스를 상속하면 추상 메서드를 구현할 의무가 생긴다.
public class Desktop extends Computer {
    @Override
    public void display() {
        System.out.println("Desktop display");
    }

    @Override
    public void typing() {
        System.out.println("Desktop typing");
    }

}
