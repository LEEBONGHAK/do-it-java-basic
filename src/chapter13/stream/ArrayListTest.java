package chapter13.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("c");
        stringList.add("b");
        stringList.add("a");

        Stream<String> stream = stringList.stream();
        stream.forEach(s -> System.out.println(s));

        for (String s : stringList) {
            System.out.println(s);
        }

        System.out.println("-------");

        stringList.stream().sorted().forEach(s -> System.out.println(s));
    }
}
