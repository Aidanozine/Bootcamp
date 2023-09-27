/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter6.abstracts;

/**
 *
 * @author desmo
 */
public abstract class Animal {
    abstract void showTeeth();
    abstract void proudlyPlump();
}

//class Walrus extends Animal{} //can't compile

abstract class Walrus extends Animal{
    @Override
    void showTeeth(){} //implemented from Animal directly
    
    abstract void eatFish();
}

class ElephantSeal extends Walrus{
    @Override
    void proudlyPlump(){} //implemented from Walrus from Animal
    
    @Override
    void eatFish(){}
}
