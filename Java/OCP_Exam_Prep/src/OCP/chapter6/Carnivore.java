/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter6;

/**
 *
 * @author desmo
 */
public class Carnivore {
    protected boolean hasFur = false;
}

class Meerkat extends Carnivore{
    protected boolean hasFur = true;
    
    public static void main(String[] args) {
        Meerkat timone = new Meerkat();
        Carnivore c = timone;
        System.out.println(timone.hasFur);
        System.out.println(c.hasFur);
    }
}
