/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter5.pond.swan;

/**
 *
 * @author desmo
 */
import OCP.chapter5.pond.shore.Bird;

public class Swan extends Bird {
    public void swim(){
        floatInWater();
        System.out.println(text);
    }
    
    public void helpOtherSwan(){
        Swan other = new Swan();
        other.floatInWater();
        System.out.println(other.text);
    }
    
    public void helpOtherBird(){
        Bird otherBird = new Bird();
//        otherBird.floatInWater();
//        System.out.println(otherBird.text);
    }
}
