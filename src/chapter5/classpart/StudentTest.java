package chapter5.classpart;

public class StudentTest {
    public static void main(String[] args) {

        // 인스턴스 생성
        // 인스턴스는 힙(Heap) 메모리에 생성되며, 각각의 인스턴스는 다른 메모리에 다른 값을 가짐
        // 할당된 메모리는 가비지 컬렉테(Garbage Collector)에 의해 자동으로 해제됨
        Student studentLee = new Student();
        studentLee.studentName = "이봉학";
        studentLee.studentID = 100;
        studentLee.address = "hello";

        Student studentKim = new Student(1, "tmp2");
        studentKim.studentName = "김유신";
        studentKim.studentID = 101;
        studentKim.address = "world";

        studentLee.showStudentInfo();
        studentKim.showStudentInfo();

        // 인스턴스 출석 형식 `클래스의 전체 이름@주소값`
        // 주소 값은 16진수로 이루어져 있으며 32 bit 주소값을 가진다.
        System.out.println(studentKim);
        System.out.println(studentLee);
    }
}
