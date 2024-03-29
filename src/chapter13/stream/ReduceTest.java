package chapter13.stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {
    @Override
    public String apply(String s, String s2) {
        if (s.getBytes().length <= s2.getBytes().length) return s;
        else return s2;
    }
}

public class ReduceTest {
    public static void main(String[] args) {
        String[] strings = {"안녕하세요~~~~~", "hello", "Good morning", "반갑습니다."};

        String result = Arrays.stream(strings).reduce("", (s1, s2) -> {
            if (s1.getBytes().length >= s2.getBytes().length) return s1;
            else return s2;
        });
        System.out.println(result);

        String result1 = Arrays.stream(strings).reduce(new CompareString()).get();
        System.out.println(result1);
    }
}
