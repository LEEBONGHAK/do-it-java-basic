package chapter7.src.arraylist;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(1, "lee");
        s1.addSubject("a", 100);
        s1.addSubject("b", 50);

        s1.showStudentInfo();

        System.out.println("============");

        Student s2 = new Student(2, "kim");
        s2.addSubject("c", 20);
        s2.addSubject("d", 50);

        s2.showStudentInfo();
    }
}
