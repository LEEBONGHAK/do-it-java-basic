package chapter13.innerclass;

class OutClass {
    private int num = 10;
    private static int sNum = 20;
    InClass inClass;

    public OutClass() {
        this.inClass = new InClass();
    }

    // 내부 클래스
    // - 내부 클래스에서는 static 변수 / 메서드를 생성할 수 없다.
    class InClass {
        int inNum = 200;
//        static int sInNum = 100;

        void inTest() {
            System.out.println(num);
            System.out.println(sNum);
            System.out.println(inNum);
        }
    }
}

public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        outClass.inClass.inTest();

        OutClass.InClass inClass = outClass.new InClass();
        inClass.inTest();
    }
}
