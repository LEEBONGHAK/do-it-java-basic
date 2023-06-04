package chapter8.downcasting;

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }

    public void readBook() {
        System.out.println("사림이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    public void move() {
        System.out.println("호랑이가 네발로 튑니다.");
    }

    public void hunting() {
        System.out.println("호랑이 사냥을 합니다.");
    }
}

class Eagle extends Animal {
    public void move() {
        System.out.println("독수리가 하늘을 날읍니다.");
    }

    public void flying() {
        System.out.println("날라갑니다");
    }
}

public class AnimalTest {
    public static void main(String[] args) {

        AnimalTest test = new AnimalTest();
        test.moveAnimal(new Animal());
        test.moveAnimal(new Human());
        test.moveAnimal(new Tiger());
        test.moveAnimal(new Eagle());
    }

    public void moveAnimal(Animal animal) {
        animal.move();

        /*
         * down-casting
         * - 명시적으로 상위 클래스로 up-casing 상태로 되어 있는 인스턴스를 원래 하위 클래스 타입으로 명시적 형변환을 하는 것
         */
//        Human h = (Human) animal;
//        h.readBook();
        if (animal instanceof Human) {
            Human human = (Human) animal;
            human.readBook();
        } else if (animal instanceof Tiger) {
            Tiger tiger = (Tiger) animal;
            tiger.hunting();
        } else if (animal instanceof Eagle) {
            Eagle eagle = (Eagle) animal;
            eagle.flying();
        } else {
            System.out.println("지원되지 않는 기능입니다.");
        }
    }
}
