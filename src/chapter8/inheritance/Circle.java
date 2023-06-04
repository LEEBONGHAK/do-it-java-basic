package chapter8.inheritance;

public class Circle {

    // Circle 과 Point 클래스는 서로 일반적/구체적 의미 관계가 아니기 때문에 상송을 사용하지 않는다.
    private Point point;    // has-a 관계
    private int radius;

    public Circle() {
        point = new Point();
    }
}
