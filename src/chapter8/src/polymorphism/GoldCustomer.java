package chapter8.src.polymorphism;

public class GoldCustomer extends Customer {
    public GoldCustomer() {
        bonusRatio = 0.05;
    }

    // 컴파일러에게 해당 기능을 명시적으로 보여주기 위한 annotation
    @Override
    public int calcPrice(int price) {
        return super.calcPrice(price);
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo();
    }
}
