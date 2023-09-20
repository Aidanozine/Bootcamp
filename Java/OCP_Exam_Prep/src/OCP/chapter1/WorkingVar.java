/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter1;

/**
 *
 * @author desmo
 */
public class WorkingVar {
    public static void main(String[] args) {
        var num = 7;
        System.out.println(num);
        num = 4;
        System.out.println(num);
//        num = "Hey"; //can't compile num is type int
        var wrd = "Hi";
        System.out.println(wrd);
        wrd = "Bye";
        System.out.println(wrd);
//        wrd = 5; //can't compile wrd is type object

        /**var num2;
        num2 = 5;*/ //needs to be in one line
        
        int min, mid, max;
        min = 1;
        mid = 2;
        max = 3;
        
        /**var first, second, third; //not allowed
        first = "a";
        second = "b";
        third = "c";*/
        
        /**public void var(var a, var b){ //can't
            int var
        }
        
        Class var*/ //can't
    }
}
