/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter6;

/**
 *
 * @author desmo
 */
public class Mammal {

//    public Mammal() {
//    } //no arg
//}

    public Mammal(int age) {
    }
}

//class Seal extends Mammal {
////super(); //super() by default (no problem)
//}

class Seal extends Mammal {

    public Seal(int age) {
        super(age);
    }
}

//class Elephant extends Mammal {
//    public Elephant(){} //can't get no arg constructor
//}

class Elephant extends Mammal {

//        public Elephant() { //no argument constructor
//        } //can't get be no arg constructor

    public Elephant(int age) {
        super(age);
    }
    
    public Elephant(){
        this(1);
    }
}
