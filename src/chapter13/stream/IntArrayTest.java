package chapter13.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        IntStream stream = Arrays.stream(arr);
        int sum = stream.sum();
        System.out.println(sum);

        // stream 재사용 불가
//        int count = (int) stream.count();
//        System.out.println(count);


    }
}
