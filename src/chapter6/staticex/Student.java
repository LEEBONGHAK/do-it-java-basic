package chapter6.staticex;

public class Student {
    /*
    * static 변수
    * - 여러 인스턴스가 같은 메모리의 값을 공유하기 위해 사용
    * - 인스턴스가 생성될 때마다 다른 메모리를 가지는 것이 아닌 프로그램이 메모리에 적재(load)될 때 데이터 영역의 메모리에 생성됨
    * - 즉, 인스턴스 생성과 관계없이 클래스 이름으로 직접 참조하며 `클래스 변수`라고도 함
    * */
    static int serialNum = 10000;
    String studentName;
    int studentID;

    public Student() {
        serialNum++;
        studentID = serialNum;
    }

    public static int getSerialNum() {
        return serialNum;
    }
}
