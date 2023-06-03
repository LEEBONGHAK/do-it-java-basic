package chapter6.staticex;

public class StudentTest1 {
    public static void main(String[] args) {
        // static 변수는 인스턴스 생성과 관계없이 메모리에 존재한다(데이터 영역에)
        System.out.println(Student.serialNum);

        Student james = new Student();
        System.out.println(james.serialNum);
        System.out.println(james.studentID);

        Student tom = new Student();
        System.out.println(tom.serialNum);
        System.out.println(tom.studentID);

        Student.serialNum++;
        System.out.println(james.serialNum);
        System.out.println(tom.serialNum);

        System.out.println(james.studentID);
        System.out.println(tom.studentID);
    }
}
