package chapter6.cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student james = new Student("James", 5000);
        Student tom = new Student("Tom", 10000);

        Bus b1 = new Bus(100);
        james.takeBus(b1);
        james.showInfo();
        b1.showInfo();

        Subway s1 = new Subway(1);
        tom.takeSubway(s1);
        tom.showInfo();
        s1.showInfo();
    }
}
