package chapter10.multiimplement;

public class Customer implements Buy, Sell {
    @Override
    public void buy() {
        System.out.println("구매하기");
    }

    @Override
    public void sell() {
        System.out.println("판매하기");
    }

    // 상속 받은 인터페이스들 내에 디폴트 메서드가 중복될 경우 overriding 하여 해결
    @Override
    public void order() {
        System.out.println("고객 주문");
    }
}
