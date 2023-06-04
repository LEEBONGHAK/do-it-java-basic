package chapter10.multiimplement;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();

        Buy buyer = customer;
        buyer.buy();

        Sell seller = customer;
        seller.sell();

        customer.buy();
        customer.sell();

        buyer.order();
        seller.order();
        customer.order();
    }
}
