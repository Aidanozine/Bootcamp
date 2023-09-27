/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter6;

/**
 *
 * @author desmo
 */
public class Beetle extends Insect{
    protected int legs = 6;
    short age = 3;
    public void printData(){
        System.out.println(this.label);
        System.out.println(super.label);
        System.out.println(this.age);
//        System.out.println(super.age); // age can't be inherited
        System.out.println(legs);
    }
    
    public static void main(String[] args) {
        new Beetle().printData();
    }
}

class Insect{
    protected int legs = 4;
    String label = "buggy";
}