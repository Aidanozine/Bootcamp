
package Exercises.Lesson_5.Ex_1;

public class ShoppingCart {

    public static void main(String[] args) {
        String cons = "Bill Murray";
        String item = "Fancy Hat";

        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
	double total;
	String message = cons+" wants to purchase "+quantity+" "+item;

        total = (price*quantity)*tax;


        boolean outOfStock = false;

        if (quantity > 1){
            message = message +"s";
        } 

        if (outOfStock){  
            System.out.println(item+" is out of stock.");
        }
        else{
            System.out.println(message);
            System.out.println("Total cost with tax: "+ total);
        }
               
    }
    
}
