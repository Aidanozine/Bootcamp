/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter6;

/**
 *
 * @author desmo
 */
public class Duck {

    private String color;
    private int height;
    private int length;

    public void setData(int length, int height) {
        this.length = length; // turns value to zero if backwards
        this.height = height; // fine
        this.color = "white"; // not necessary
    }

    public static void main(String[] args) {
        Duck b = new Duck();
        b.setData(1, 2);
        System.out.println(b.length + " " + b.height + " " + b.color);
    }
}
