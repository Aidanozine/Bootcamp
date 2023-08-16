
package Exercise4_2;

public class ShoppingCart {

    public static void main(String[] args) {
        String cons = "Mary Smith";
        String item = "Shirt";
        String message = cons+" wants to purchase a "+item;

        double price = 29.99;
        int quantity = 2;
        double tax = 1.04;
        double total;

        message = cons+" wants to purchase "+quantity+ " "+item;
        
        System.out.println(message);

        total = quantity * price * tax;
        
        System.out.println("Total cost with tax: "+total);
    }
    
}
