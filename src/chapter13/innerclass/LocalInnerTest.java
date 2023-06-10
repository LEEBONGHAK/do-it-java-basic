package chapter13.innerclass;

class Outer {

    int outNum = 100;
    static int sNum = 200;
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("runnable");
        }
    };

    public Runnable getRunnable() {
        int localNum = 100;

        class MyRunaable implements Runnable {
            @Override
            public void run() {
                System.out.println(outNum);
                System.out.println(sNum);
                System.out.println(localNum);
            }
        }

        return new MyRunaable();
    }

    public Runnable getAnotherRunnable(int i) {
        int localNum = 100;

        class MyRunaable implements Runnable {
            @Override
            public void run() {
//                localNum += 100; // error
//                i += 10;   // error

                System.out.println(outNum);
                System.out.println(sNum);
                System.out.println(localNum);
                System.out.println(i);
            }
        }

        return new MyRunaable();
    }

    public Runnable getOtherRunnable(int i) {
        int localNum = 100;

        return new Runnable() {

            @Override
            public void run() {
                outNum += 10;

                System.out.println(outNum);
                System.out.println(sNum);
                System.out.println(localNum);
                System.out.println(i);
            }
        };
    }
}

public class LocalInnerTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.getRunnable().run();

        outer.getAnotherRunnable(1).run();
        outer.getOtherRunnable(12).run();
        outer.runnable.run();
    }
}
