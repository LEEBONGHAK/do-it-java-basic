package chapter13.innerclass;

class OutClass1 {
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass1() {
        this.inClass = new InClass();
    }

    // 내부 클래스
    // - 내부 클래스에서는 static 변수 / 메서드를 생성할 수 없다.
    private class InClass {
        int inNum = 200;
//        static int sInNum = 100;

        void inTest() {
            System.out.println(num);
            System.out.println(sNum);
            System.out.println(inNum);
        }
    }

    public void usingInTest() {
        inClass.inTest();
    }
}

public class InnerTest1 {
    public static void main(String[] args) {
        OutClass1 outClass = new OutClass1();
        outClass.usingInTest();
    }
}
