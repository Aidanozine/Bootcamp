/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter5;

/**
 *
 * @author desmo
 */
public class StaticInitializers2 {
    private static int one;
    private static final int two;
    private static final int three =3;
//    private static final int four; // not initialized - can't compile
    
    static{
        one = 1; // not final
        two = 2;
//        three = 3; // already has a value - can't compile
//        two = 4; // already has a value - can't compile
    }
    
    public static void main(String[] args) {
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}
