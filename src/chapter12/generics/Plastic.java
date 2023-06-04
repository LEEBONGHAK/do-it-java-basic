package chapter12.generics;

public class Plastic extends Material {

    @Override
    public String toString() {
        return "나는 플라스틱!";
    }

    @Override
    public void doPrinting() {
        System.out.println("Plastic POWER!!!");
    }
}
