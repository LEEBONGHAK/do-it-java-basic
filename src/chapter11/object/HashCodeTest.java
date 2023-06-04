package chapter11.object;

class Company {
    int id;
    String name;

    public Company(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Company co) {
            return this.id == co.id;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id;
    }
}

public class HashCodeTest {
    public static void main(String[] args) {
        String str1 = new String("test");
        String str2 = new String("test");

        Company co1 = new Company(10001, "test");
        Company co2 = new Company(10001, "test");

        System.out.println(co1.hashCode());
        System.out.println(co2.hashCode());
        // 실제 힙 메모리 내의 해시
        System.out.println(System.identityHashCode(co1));
        System.out.println(System.identityHashCode(co2));

        System.out.println("==================");

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        // 실제 힙 메모리 내의 해시
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
    }
}
