/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter6;

/**
 *
 * @author desmo
 */
public class Hamster {
    private String color;
    private int weight;
    
    public Hamster (int weight, String color){
        this.weight = weight;
        this.color = color;
    }
    
    public Hamster (int weight){
        this(weight, "brown"); //nothing can be placed ahead of this()
    } //colour isn't passed, so brown is default
    
    public static void main(String[] args) {
        var h = new Hamster(23);
        System.out.println(h);
        var h2 = new Hamster(12, "black");
        System.out.println(h2);
    }
    
    @Override
    public String toString(){
        return this.weight + " " + this.color;
    }
}
