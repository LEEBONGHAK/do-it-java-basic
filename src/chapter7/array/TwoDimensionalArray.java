package chapter7.array;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr1 = new int[2][3];

        // 행을 기준으로 length 를 가지고 온다
        System.out.println(arr1.length);
        System.out.println("===========");

        int[][] arr2 = {{1,2,3}, {4,5,6}};
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.println(arr2[i][j]);
            }
            System.out.println();
        }
        System.out.println("===========");

    }
}
