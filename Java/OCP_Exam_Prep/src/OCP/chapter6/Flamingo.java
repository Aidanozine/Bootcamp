/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter6;

/**
 *
 * @author desmo
 */
public class Flamingo {
    private String color = null;
public void setColor(String color) {
this.color = color;
}
public static void main(String... unused) {
var f = new Flamingo();
f.setColor("pink");
System.out.println(f.color);
}
}
