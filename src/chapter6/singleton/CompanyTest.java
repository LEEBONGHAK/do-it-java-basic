package chapter6.singleton;


import java.util.Calendar;

/*
* singleton 패턴
* - 전 시스템에서 단 하나의 인스턴스만이 존재하도록 구현하는 방식
* - static 변수 사용, private 생성자, public static 메서드 사용
* */
public class CompanyTest {

    public static void main(String[] args) {
        Company c1 = Company.getInstance();
        Company c2 = Company.getInstance();

        // c1, c2는 같은 인스턴스이다.
        System.out.println(c1);
        System.out.println(c2);

        // 싱글톤으로 제공하는 시간 관련 자바 유틸 클래스
        Calendar cal = Calendar.getInstance();
    }

}
