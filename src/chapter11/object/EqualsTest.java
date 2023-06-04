package chapter11.object;

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student std = (Student) obj;
            return this.id == std.id;
        }
        return false;
    }
}

public class EqualsTest {
    public static void main(String[] args) {
        String str1 = new String("test1");
        String str2 = new String ("test2");

        // 같은 주소값이 아니기 때문에 false
        System.out.println(str1 == str2);
        // 문자열이 같은지 확인
        System.out.println(str1.equals(str2));

        System.out.println();

        Student student1 = new Student(10001, "Tom");
        Student student2 = new Student(10001, "Tom");
        System.out.println(student1 == student2);
        System.out.println(student1.equals(student2));
    }
}
