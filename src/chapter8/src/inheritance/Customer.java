package chapter8.src.inheritance;

public class Customer {
    // protected 키워드는 패키지가 달라도 접근 할 수 있지만, 상속 관계에서만 접근 가능
    protected int id;
    protected String name;
    protected String grade;
    int bonusPoint;
    double bonusRatio;

    public Customer() {
        grade = "SILVER";
        bonusRatio = 0.01;
    }

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
        grade = "SILVER";
        bonusRatio = 0.01;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo() {
        return name + ", " + grade + ", " + bonusPoint;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public void setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
    }
}
