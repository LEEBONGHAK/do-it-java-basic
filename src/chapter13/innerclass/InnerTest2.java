package chapter13.innerclass;

class OutClass2 {
    private int num = 10;
    private static int sNum = 20;

    // static inner class
    static class InStaticClass {
        int iNum = 100;
        static int sInNum = 200;

        void inTest() {
//            num += 10; // error
            sNum += 10;
            System.out.println(sNum);
            System.out.println(iNum);
            System.out.println(sInNum);
        }

        static void sTest() {
            System.out.println(sNum);
            System.out.println(sInNum);
        }
    }
}

public class InnerTest2 {
    public static void main(String[] args) {
        OutClass2 outClass = new OutClass2();

        OutClass2.InStaticClass sInClass = new OutClass2.InStaticClass();
        sInClass.inTest();

        System.out.println(OutClass2.InStaticClass.sInNum);
        OutClass2.InStaticClass.sTest();
    }
}
