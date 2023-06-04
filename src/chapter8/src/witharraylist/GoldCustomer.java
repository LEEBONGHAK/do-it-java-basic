package chapter8.src.witharraylist;

public class GoldCustomer extends Customer {

    double saleRatio;

    public GoldCustomer() {
        grade = "GOLD";
        bonusRatio = 0.02;
        saleRatio = 0.1;
    }

    public GoldCustomer(int id, String name) {
        super(id, name);
        grade = "GOLD";
        bonusRatio = 0.02;
        saleRatio = 0.1;
    }

    // 컴파일러에게 해당 기능을 명시적으로 보여주기 위한 annotation
    @Override
    public int calcPrice(int price) {
        bonusPoint = (int) (price * bonusRatio);
        return (int) (price * (1 - saleRatio));
    }

}
