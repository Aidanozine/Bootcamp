
package Exercises.Lesson_5.Ex_2;

public class ShoppingCart {

    public static void main(String[] args) {
        String cons = "Bill Murray";
        String message = cons + " wants to purchase a several items.";

        String[] itemList = {"Hat","Socks","Scarf","Belt"};

        message = cons + " wants to purchase "+itemList.length+" items.";
        System.out.println(message);


        System.out.println(itemList[0]);
        System.out.println(itemList[1]);
        System.out.println(itemList[2]);
        System.out.println(itemList[3]);
    }    
}
