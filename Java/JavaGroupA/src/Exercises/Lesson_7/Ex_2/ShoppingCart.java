
package Exercises.Lesson_7.Ex_2;

public class ShoppingCart {
    public static void main (String[] args){
        String cons = "Tom Middleton";
        String firstName;
        int spaceIdx;
        StringBuilder sb;
       
        spaceIdx = cons.indexOf(" ");
        firstName = cons.substring(0, spaceIdx);
        System.out.println(firstName);

        sb = new StringBuilder(firstName);

        sb.append(" Middleton");

        System.out.println(sb);
    }    
}
