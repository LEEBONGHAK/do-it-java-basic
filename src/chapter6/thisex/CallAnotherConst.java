package chapter6.thisex;

class Person {
    String name;
    int age;

    // 생성자에서 다른 생성자를 호출하는 this
    // 위 기능을 사용할때는 위에 다른 코드가 있으면 안됨 -> 인스턴스가 생성 전에 코드를 실행하려고 하는 것이기 때문에
    // 즉, 클래스의 모든 코드는 인스턴스 할당 후 의미가 생김
    public Person() {
        this("이름 없음", 1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person returnSelf() {
        return this;
    }

    public void showPersonInfo() {
        System.out.println(name + " " + age);
    }
}

public class CallAnotherConst {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.showPersonInfo();
        System.out.println(p1);
        System.out.println(p1.returnSelf());
    }
}
