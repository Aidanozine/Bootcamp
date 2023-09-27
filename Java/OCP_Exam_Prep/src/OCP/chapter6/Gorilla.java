/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter6;

/**
 *
 * @author desmo
 */
public class Gorilla extends Animal {
    public Gorilla(int age){
        super(age, "Gorilla"); //Calls first Animal constructor
    }
    
    public Gorilla(){
        this(5); //Calls seccond Animal constructor
    }
    
    public static void main(String[] args) {
        var g = new Gorilla();
        System.out.println(g);
        var g2 = new Gorilla(10);
        System.out.println(g2);
    }
    
    @Override
    public String toString(){
        return this.getName() + " " + this.getAge();
    }
}
