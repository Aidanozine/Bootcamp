/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter7;

/**
 *
 * @author desmo
 */
public class Primate {

    public boolean hasHair() {
        return true;
    }
}

interface HasTail {

    public abstract boolean isTailStriped();
}

class Lemur extends Primate implements HasTail{
    @Override
    public boolean isTailStriped() {
        return false;
    }
    public int age = 10;
    
    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
        
        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());
        
        Primate p = lemur;
        System.out.println(p.hasHair());
    }
}
