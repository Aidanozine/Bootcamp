/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter3;

/**
 *
 * @author desmo
 */
public class Chapter3 {

    public static void main(String[] args) {
        Integer number = 7;
//        Double number = 7.0;
        compareIntegers(number);

//        Integer number = 5;
//        compareIntegers(number);
//        
//        Integer number = 3;
//        compareIntegers(number);
    }

//    static void compareIntegers(Number number) {
//        if (number instanceof Integer) {
//            Integer data = (Integer) number;
//        }
//    }
//    static void compareIntegers(Number number) {
//        if (number instanceof final Integer data) {
//            System.out.println(data.compareTo(5));
//        }  else {
//            return;
//        }
//    }
    
    static void compareIntegers(Number number) {
        if (!(number instanceof final Integer data)) {
            System.out.println("Not of type: integer");
        } else {
            System.out.println(data.compareTo(5));
        }
    }

//    static void printIntegersOrNumbersGreaterThan5(Number number) {
//        if (number instanceof Integer data || data.compareTo(5) > 0) {
//            System.out.print(data);
//        } else {
//           System.out.println("Not of type: integer"); 
//        } 
//    } //doesn't work with || needs &&
    
    static void printIntegersOrNumbersGreaterThan5(Number number) { //working version of above
        if (number instanceof Integer data && data.compareTo(5) > 0) {
            System.out.println(data);
        }
    }
}
