/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter9.Generics;

/**
 *
 * @author desmo
 */
public class GenericInterfaceTest {
    Shippable sac = new ShippableAbstractCrate<Animal>();
    Shippable src = new ShippableRobotCrate<Robot>();
}

class Animal{
    
}

class Robot{
    
}

interface Shippable<T>{
    void ship(T t);
}

class ShippableRobotCrate<Robot> implements Shippable<Robot> {
public void ship(Robot t) { }
}

class ShippableAbstractCrate<U> implements Shippable<U> {
public void ship(U t) { }
}

class ShippableCrate implements Shippable {
public void ship(Object t) { }
}
