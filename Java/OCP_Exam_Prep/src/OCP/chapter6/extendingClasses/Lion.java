/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter6.extendingClasses;

/**
 *
 * @author desmo
 */
public class Lion extends Animal {

    protected void setProperties(int age, String n) {
        setAge(age);
        name = n;
    }

    public void roar() {
        System.out.println(name + "(even at age " + getAge() + ") Roars with flavour!");
    }

    public static void main(String[] args) {
        var lion = new Lion();
        lion.setProperties(3, "Simba");
        lion.roar();
    }
}
