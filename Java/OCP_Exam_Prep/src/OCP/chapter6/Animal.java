/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter6;

/**
 *
 * @author desmo
 */
public class Animal {
    private int age;
    private String name;
    
    public Animal(int age, String name){
        super(); // Refers to constructor in java.lang.Object
        this.age = age;
        this.name = name;
    }
    
    public Animal(int age){
        super(); //needed for zebra but redundant
        this.age = age;
        this.name = null;
    }
    
    public void setAge(int Age){
        this.age = age;
    }
    
    public int getAge(){
    return age;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public static void main(String[] args) {
        var z = new Zebra();
        System.out.println(z);
        
        var z2 = new Zebra(8);
        System.out.println(z2);
        
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
