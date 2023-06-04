package chapter8.polymorphism;

public class VIPCustomer extends Customer {
    double saleRatio;
    int agentID;

    public VIPCustomer() {
        grade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;

        System.out.println("VIPCustomer() 호출");
    }

    public VIPCustomer(int id, String name, int agentID) {
        // super : 상속 받아 생성된 상위 클래스를 가리킨다.
        super(id, name);
        grade = "VIP";
        bonusRatio = 0.05;
        this.agentID = agentID;
        saleRatio = 0.1;

        System.out.println("VIPCustomer() 호출");
    }

    public double getSaleRatio() {
        return saleRatio;
    }

    public int getAgentID() {
        return agentID;
    }

    public int calcPrice(int price) {
        bonusPoint = (int) (price * bonusRatio);
        return (int) (price * (1 - saleRatio));
    }
}
