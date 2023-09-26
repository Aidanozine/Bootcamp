/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter5;

/**
 *
 * @author desmo
 */
public class Varargs {
    public static void walk1(int... steps) {
        String foot = "Right foot";
         for (int step : steps){
             System.out.println(step);
             if (foot.equals("Right foot")){
                 foot = "Left foot";
                 System.out.println("Left foot");
             } else {
                 foot = "Right foot";
                 System.out.println("Right foot");
             }
         }
         
         int[] array = steps;
         System.out.println("Array length: " + array.length);
    }
    public static void walk2(int start, int... steps) {
        System.out.println("You have taken " + steps.length + " steps.");
    }
    
//    public static void walk3(int... steps, int start){} //can't do
    
//    public static void walk4(int... start, int... steps){} //can't do
    
    public static void main(String[] args) {
        int[] dataArray = new int[]{1, 2 ,3 ,4 ,5, 6, 7, 8, 9, 10};
        walk1(dataArray);
        //OR
//        walk1(1, 2, 3);
        
        walk2(1, 2 ,3, 4, 5, 6, 7, 8, 9, 10);
        walk2(10, new int[]{1,2,3,4,5,6});
        
//        walk2(1, null);
    }
}
