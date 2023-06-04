package chapter8.witharraylist;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer cs1 = new Customer(10100, "Lee");
        Customer cs2 = new Customer(10101, "Choi");
        GoldCustomer cs3 = new GoldCustomer(10102, "Park");
        GoldCustomer cs4 = new GoldCustomer(10103, "No");
        VIPCustomer cs5 = new VIPCustomer(10104, "Kim", 100);

        customers.add(cs1);
        customers.add(cs2);
        customers.add(cs3);
        customers.add(cs4);
        customers.add(cs5);

        System.out.println("=========고객정보 출력========");
        for (Customer c : customers) {
            System.out.println(c.showCustomerInfo());
        }

        System.out.println("=========할인률과 포인트 결과========");
        for (Customer c : customers) {
            int cost = c.calcPrice(10000);

            System.out.println(c.getName() + ", " + cost);
            System.out.println(c.showCustomerInfo());
        }

    }
}
