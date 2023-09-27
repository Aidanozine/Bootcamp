/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter6;

/**
 *
 * @author desmo
 */
public abstract class Canine {

    public abstract String getSound();

    public void Bark() {
        System.out.println(getSound());
    }

    public static void main(String[] p) {
        Canine w = new Wolf();
        w.Bark();
        
        Canine f = new Fox();
        f.Bark(); // Squeak!
        
        Canine c = new Coyote();
        c.Bark();
    }
}

class Wolf extends Canine {

    public String getSound() {
        return "Wooooooof!";
    }
}

class Fox extends Canine {

    public String getSound() {
        return "Squeak!";
    }
}

class Coyote extends Canine {

    public String getSound() {
        return "Roar!";
    }
}
