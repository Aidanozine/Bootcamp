/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter5.pond.goose;

/**
 *
 * @author desmo
 */
import OCP.chapter5.pond.shore.Bird;

public class Gosling extends Bird {

    public void swim() {
        floatInWater();
        System.out.println(text);
    }

    public static void main(String[] args) {
        new Gosling().swim();
    }
}
