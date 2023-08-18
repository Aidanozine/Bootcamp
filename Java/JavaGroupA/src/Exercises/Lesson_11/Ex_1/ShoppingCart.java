package Exercises.Lesson_11.Ex_1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ShoppingCart {
    public static void main(String[] args){
        LocalDateTime orderDate;

        orderDate = LocalDateTime.now();
        System.out.println("Order date: "+ orderDate);

        String fDate = orderDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("Formatted order date: "+ fDate);
    }
}