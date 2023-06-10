package collectionframework.set.hashset;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        boolean b1 = hashSet.add("aaa");
        System.out.println(b1);
        hashSet.add("bbb");
        hashSet.add("ccc");
        hashSet.add("ddd");

        System.out.println(hashSet);

        boolean b2 = hashSet.add("aaa");
        System.out.println(b2);

        System.out.println(hashSet);
    }
}
