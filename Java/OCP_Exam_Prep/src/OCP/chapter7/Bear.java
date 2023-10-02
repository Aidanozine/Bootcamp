/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter7;

/**
 *
 * @author desmo
 */
public class Bear implements Herbivore, Omnivore {
    @Override
    public void eatPlants() {
        System.out.println("Eating plants");
    }
}

interface Herbivore {

    public void eatPlants();
}

interface Omnivore {

    public void eatPlants();
}
