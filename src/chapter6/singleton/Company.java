package chapter6.singleton;

/*
 * singleton 패턴
 * - 전 시스템에서 단 하나의 인스턴스만이 존재하도록 구현하는 방식
 * - static 변수 사용, private 생성자, public static 메서드 사용
 * */
public class Company {

    // 전체 시스템에서 유일한 Company 인스턴스
    private static Company instance = new Company();

    // 외부에서 생성자를 호출할 수 없도록 하겠다 (클래스 내부에서만 호출)
    private Company() {}

    public static Company getInstance() {
        return instance;
    }
}
