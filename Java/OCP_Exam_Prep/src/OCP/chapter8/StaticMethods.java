/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter8;

/**
 *
 * @author desmo
 */
public class StaticMethods {
    public static void main(String[] args) {
        Converter methodRef = Math::round; //namesake static method
        System.out.println(methodRef.round(4.909090909));
    }
}

@FunctionalInterface
interface Converter{
    long round(double num);
}
