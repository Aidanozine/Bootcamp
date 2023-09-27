/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter6.abstracts;

/**
 *
 * @author desmo
 */
public abstract class Animal2 {

    abstract String getName();
}

abstract class BigCat extends Animal2 {

    protected abstract void Roar();
}

class Lion extends BigCat {

    public String getName() { //implements from Animal2 from BigCat
        return "Leo";
    }

    public void Roar() { //implements from BigCat
        System.out.println("Meooow!");
    }
    
    public static void main(String[] args) {
        Lion l = new Lion();
        l.Roar();
        System.out.println(l.getName());
    }
}
