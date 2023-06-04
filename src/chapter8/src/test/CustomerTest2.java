package chapter8.src.test;

import chapter8.src.inheritance.Customer;
import chapter8.src.inheritance.VIPCustomer;

public class CustomerTest2 {
    public static void main(String[] args) {
        Customer cs2 = new Customer(10100, "Lee");

        // 상위 클래스가 먼저 생성된다.
        VIPCustomer vcs2 = new VIPCustomer(10101, "Kim", 1);

        System.out.println(cs2.showCustomerInfo());
        System.out.println(vcs2.showCustomerInfo());
    }
}
