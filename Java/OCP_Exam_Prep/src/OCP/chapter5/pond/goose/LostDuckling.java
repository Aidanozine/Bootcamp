/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter5.pond.goose;

import OCP.chapter5.pond.duck.DuckTeacher;

/**
 *
 * @author desmo
 */
public class LostDuckling {
    public void swim(){
        var teacher = new DuckTeacher();
        teacher.swim();
        System.out.println("Thanks " + teacher.name);
    }
}
