
package ExercisesJava.Lesson_10.Ex_2;

public class ShoppingCart {
    public static void main(String args[]){
        Order order = new Order("Xander Cage", 725.00, "VA", Order.NONPROFIT);
        System.out.println("Discount is: "+ order.getDiscount());
    }
}
