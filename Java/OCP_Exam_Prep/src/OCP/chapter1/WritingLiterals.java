/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter1;

/**
 *
 * @author desmo
 */
public class WritingLiterals {

    public static void main(String[] args) {
        long MAX = 5555533L;
        System.out.println("MAX: " + MAX);
        Double mil = 1_000_000.00;
        System.out.println("mil: " + mil);

        String reference = "Hello";
        int len = reference.length();
        System.out.println("len: " + len);
        /**
         * int refLen = len.length(); //won't compile, int can't create a
         * variable int is a primitive type
         */
        int i = Integer.parseInt("123");
        System.out.println("i: " + i);
        int i2 = Integer.valueOf("456");
        System.out.println("i2: " + i2);

        Double apple = Double.valueOf("200.99");
        System.out.println("apple(byte): " + apple.byteValue()); // -56
        System.out.println("apple(int): " + apple.intValue()); // 200
        System.out.println("apple(double): " + apple.doubleValue()); // 200.99
        
        var hi = "";
        hi = null;
    }
}
