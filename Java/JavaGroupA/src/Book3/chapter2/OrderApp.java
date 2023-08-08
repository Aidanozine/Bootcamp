package Book3.chapter2;

import java.text.NumberFormat;

public class OrderApp {
    static NumberFormat cf = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) {
        Order order1 = new Order();
        order1.setQuantityOrdered(20);
        order1.setUnitPrice(5.99);
        double total1 = order1.getOrderTotal();
        System.out.println("The total for order1 is: " + cf.format(total1));

        Order order2 = new Order();
        order2.setQuantityOrdered(200);
        order2.setUnitPrice(5.99);
        double total2 = order2.getOrderTotal();
        System.out.println("The total for order2 is: " + cf.format(total2));
    }
}
