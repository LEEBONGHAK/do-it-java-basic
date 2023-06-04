package chapter9.abstractex;

public class ComputerTest {
    public static void main(String[] args) {
        // Error
        // 추상 클래스는 new 로 인스턴스를 생성할 수 없다.
//        Computer c = new Computer();
//        Computer c0 = new Laptop();

        Computer c1 = new Desktop();
        Computer c2 = new MyLaptop();
    }
}
