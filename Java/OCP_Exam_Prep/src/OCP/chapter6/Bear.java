/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter6;

/**
 *
 * @author desmo
 */
public class Bear {

    class Bird {
        private class BlueTang {} // DOES NOT COMPILE
    }

//    class Bear { //already initialized in OCP
//    }

    class Fish {
        protected class ClownFish{} // DOES NOT COMPILE
    }
}
