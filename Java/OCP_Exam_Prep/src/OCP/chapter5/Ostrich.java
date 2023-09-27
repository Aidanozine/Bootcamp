/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter5;

/**
 *
 * @author desmo
 */
public class Ostrich {
    public void fly(int i){
        System.out.print("int");
    }
    
    public void fly(long l){
        System.out.print("long");
    }
    
    public static void main(String[] args) {
        var p = new Ostrich();
        p.fly(123);
        System.out.print("-");
        p.fly(123L);
    }
}
