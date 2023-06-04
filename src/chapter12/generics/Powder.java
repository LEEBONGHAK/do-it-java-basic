package chapter12.generics;

public class Powder extends Material {
    @Override
    public String toString() {
        return "제 이름은 파우더 입니다.";
    }

    @Override
    public void doPrinting() {
        System.out.println("Powder Power!!!");
    }
}
