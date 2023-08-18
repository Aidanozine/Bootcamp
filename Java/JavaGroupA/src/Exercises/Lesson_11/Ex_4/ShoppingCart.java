package Exercises.Lesson_11.Ex_4;

import java.util.ArrayList;

public class ShoppingCart {

    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("Shirt");
        items.add("WristBand");
        items.add("Pants");

        System.out.println(items);
        items.add(2, "Belt");
        System.out.println(items);
        
         if (items.contains ("Shirt")){
           items.remove("Shirt");
         }
         System.out.println(items);
    }
}
