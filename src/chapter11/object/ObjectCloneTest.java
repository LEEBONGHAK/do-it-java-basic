package chapter11.object;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + ", " + y;
    }
}

class Circle implements Cloneable {
    Point point;
    int radius;

    public Circle(int x, int y, int radius) {
        point = new Point(x, y);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return this.point + ", " + radius;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

public class ObjectCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle = new Circle(10, 20, 5);
        Circle circle1 = (Circle) circle.clone();

        System.out.println(System.identityHashCode(circle));
        System.out.println(System.identityHashCode(circle1));

        System.out.println(circle);
        System.out.println(circle1);
    }
}
