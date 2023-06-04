package chapter8.src.test;

import chapter8.src.inheritance.Customer;
import chapter8.src.inheritance.VIPCustomer;

public class CustomerTest1 {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        cs1.setId(10100);
        cs1.setName("Lee");

        // 상위 클래스가 먼저 생성된다.
        VIPCustomer vcs1 = new VIPCustomer();
        vcs1.setId(10101);
        vcs1.setName("Kim");

        System.out.println(cs1.showCustomerInfo());
        System.out.println(vcs1.showCustomerInfo());
    }
}
