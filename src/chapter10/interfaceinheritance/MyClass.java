package chapter10.interfaceinheritance;

public class MyClass implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("myMethod()");
    }

    @Override
    public void x() {
        System.out.println("x()");
    }

    @Override
    public void y() {
        System.out.println("y()");
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        X xClass = myClass;
        Y yClass = myClass;

        myClass.x();
        myClass.y();
        myClass.myMethod();

        xClass.x();

        yClass.y();
    }
}
