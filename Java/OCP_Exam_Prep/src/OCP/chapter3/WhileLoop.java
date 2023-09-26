/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter3;

/**
 *
 * @author desmo
 */
public class WhileLoop {

    public static void main(String[] args) {
//        What is the result of the following code snippet?
        int sing = 8, squawk = 2, notes = 0;
        while (sing > squawk) {
            sing--;
            squawk += 2;
            notes += sing + squawk;
        }
        System.out.println(notes);
//A. 11
//B. 13
//C. 23
//D. 33
//E. 50
//F. The code will not compile because of line 7.
        int sing2 = 8, squawk2 = 2, notes2 = 0;
        do {
            sing2--;
            squawk2 += 2;
            notes2 += sing2 + squawk2;
        } while (sing2 > squawk2);
        System.out.println(notes2);
    }
}
