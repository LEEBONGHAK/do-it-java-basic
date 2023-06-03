package chapter5.classpart;

public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;


    // 기본 생성자
    // 생성자가 없는 경우 Java 컴파일러가 컴파일하기 전(pre-compile 단계)에 기본 생성자를 넣어준다
    public Student() {}

    // 오버로팅(overloading)
    // 메소드/생성자 이름은 같지만 매개변수가 다른 경우 서로 다른 메소드/생성자로 인식됨
    public Student(int id, String name) {
        studentID = id;
        studentName = name;
    }

    public void showStudentInfo() {
        System.out.println(studentName + ", " + address);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }
}
