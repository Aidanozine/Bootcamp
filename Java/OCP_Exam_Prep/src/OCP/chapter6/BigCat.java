/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter6;

/**
 *
 * @author desmo
 */
public class BigCat {
    protected double size;
}

class Jaguar extends BigCat {
    public Jaguar() {
        size = 10.2;
    }
    public void printDetails() {
        System.out.println(size);
    }
}

class Spider {
    public void printDetails() {
//        System.out.println(size); // DOES NOT COMPILE - doesn't extend BigCat
    }
}
