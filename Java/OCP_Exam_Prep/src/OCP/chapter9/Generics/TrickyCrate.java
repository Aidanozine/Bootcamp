/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter9.Generics;

/**
 *
 * @author desmo
 */
public class TrickyCrate<T> {
     public <T> T tricky(T t) {
        return t;
    }

    public static String crateName() {
        TrickyCrate<Robot> crate = new TrickyCrate<>();
        return crate.tricky("bot");
    }
    
    public static void main(String[] args) {
        System.out.println(crateName());
    }
}