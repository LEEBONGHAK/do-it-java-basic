package chapter8.test;

import chapter8.inheritance.Customer;
import chapter8.inheritance.VIPCustomer;

public class CustomerTest4 {
    public static void main(String[] args) {
        Customer cs4 = new Customer(10100, "Lee");
        System.out.println(cs4.calcPrice(10000));
        System.out.println(cs4.showCustomerInfo());

        System.out.println("=================");

        VIPCustomer vcs4 = new VIPCustomer(10101, "Kim", 100);
        System.out.println(vcs4.calcPrice(10000));
        System.out.println(vcs4.showCustomerInfo());

        System.out.println("=================");

        Customer vcsc = new VIPCustomer(10102, "Park", 101);
        /*
          가상 메서스(virtual method)
          - 프로그램에서 어떤 객체의 변수나 메서드의 참조는 그 타입에 따라 이루어짐
          - 가상 메서드의 경우 타입과 상관없이 실제 생성된 인스턴스의 메서드가 호출되는 원리
         */
        System.out.println(vcsc.calcPrice(10000));
        System.out.println(vcsc.showCustomerInfo());
    }
}
