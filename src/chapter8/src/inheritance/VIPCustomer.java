package chapter8.src.inheritance;

public class VIPCustomer extends Customer {
    private double saleRatio;
    private int agentID;

    public VIPCustomer() {
        grade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    public VIPCustomer(int id, String name, int agentID) {
        // super : 상위 클래스를 가리킨다.
        super(id, name);
        this.agentID = agentID;
        saleRatio = 0.1;
    }

    public double getSaleRatio() {
        return saleRatio;
    }

    public int getAgentID() {
        return agentID;
    }
}
