package chapter8.test;

import chapter8.inheritance.Customer;
import chapter8.inheritance.VIPCustomer;

public class CustomerTest3 {
    public static void main(String[] args) {
        Customer cs3 = new Customer(10100, "Lee");

        // 상위 클래스로 형변환이 가능하다 (up-casting)
        Customer vcs3 = new VIPCustomer(10101, "Kim", 1);

        // 상위 클래스로 묵시적으로 형변환을 시켰기 때문에 하위 클래스의 기능을 사용할 수 없다.
//        vcs3.agentId;
//        vcs3.saleRatio;

        System.out.println(cs3.showCustomerInfo());
        System.out.println(vcs3.showCustomerInfo());
    }
}
