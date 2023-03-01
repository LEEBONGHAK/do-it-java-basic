package chapter5.classpart;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.studentName = "이봉학";
        studentLee.address = "hello world";

        studentLee.showStudentInfo();
    }
}
