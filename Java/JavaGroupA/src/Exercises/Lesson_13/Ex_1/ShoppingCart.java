package Exercises.Lesson_13.Ex_1;

import java.util.*;

public class ShoppingCart {
    public static void main(String[] args){
        
            String[] days = {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
            
            ArrayList<String> dayList = new ArrayList(Arrays.asList(days));
            for (String s : dayList){
               if (s.equals("sunday")){
                   System.out.println(s.toUpperCase());
               }
               else System.out.println(s);
            }
            System.out.println(dayList);            
    }
}