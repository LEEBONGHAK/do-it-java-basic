package chapter7.array;

public class ArrayTest {
    public static void main(String[] args) {

        int[] ns1 = new int[] {0, 1, 2};
        System.out.println(ns1.length);

        int[] ns2 = {0, 1, 2};
        System.out.println(ns2.length);

        int[] ns3 = new int[3];
        ns3[0] = 1;
        ns3[1] = 2;
        ns3[2] = 3;

        for (int i = 0; i < ns3.length; i++) {
            System.out.println(ns3[i]);
        }

        int[] ns4;
        ns4 = new int[3];
        for (int i = 0; i < ns4.length; i++) {
            System.out.println(ns4[i]);
        }

    }
}
