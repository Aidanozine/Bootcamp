/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter9;

import java.util.ArrayList;

/**
 *
 * @author desmo
 */
public class Product implements Comparable<Product> {
    
    private int id;
    private String name;

    public int hashCode() {
        return id;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Product)) {
            return false;
        }
        var other = (Product) obj;
        return this.id == other.id;
    }

    public int compareTo(Product obj) {
        return this.name.compareTo(obj.name);
    }
    
    public String toString() {
        return name;
    }
    
    public Product(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Product p1 = new Product("Bananas");
        Product p2 = new Product("Tomatoes");
        Product p3 = new Product("Apples");
        Product p4 = new Product("Carrots");
        
        p1.id = 1;
        p2.id = 1;
        p3.id = 4;
        p4.id = 4;
        
        ArrayList<Product> cart = new ArrayList<>();
        cart.add(p1);
        cart.add(p2);
        cart.add(p3);
        cart.add(p4);
        System.out.println(cart);
        System.out.println(p1.compareTo(p2));
        System.out.println(p1.equals(p2));
        System.out.println("");
        System.out.println(p1.compareTo(p3));
        System.out.println(p1.equals(p3));
        System.out.println("");
        System.out.println(p2.compareTo(p4));
        System.out.println(p2.equals(p4));
        System.out.println("");
        System.out.println(p3.compareTo(p4));
        System.out.println(p3.equals(p4));
    }

}
