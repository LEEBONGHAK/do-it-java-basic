package chapter5.reference;

public class StudentTest {

    public static void main(String[] args) {
        Student james = new Student(100, "James");
        james.setKorea(100);
        james.setMath(100);

        Student tom = new Student(101, "Tom");
        tom.setKorea(10);
        tom.setMath(30);

        james.showStudentInfo();
        tom.showStudentInfo();
    }
}
