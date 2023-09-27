/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter6;

/**
 *
 * @author desmo
 */
public class Zebra extends Animal{
    public Zebra(int age){
        super(age, "Zebra"); //Refers to constructor in Animal
    } //makes this.name = null redundant
    
    public Zebra(){
        this(4); //Refers to constructor in Zebra with int argument
    }
    
    public static void main(String[] args) {
        var z = new Zebra();
        System.out.println(z);
        var z2 = new Zebra(8);
        System.out.println(z2);
    }
    
    @Override
    public String toString(){
        return this.getName() + " " + this.getAge();
    }
}
