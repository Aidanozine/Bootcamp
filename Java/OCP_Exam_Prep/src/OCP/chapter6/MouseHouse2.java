/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter6;

/**
 *
 * @author desmo
 */
public class MouseHouse2 {
    private final int volume;
private final String type;
{
this.volume = 10;
}
public MouseHouse2(String type) {
this.type = type;
}
public MouseHouse2() { // can't compile
    this(null); //solves reinitialization problem
//    this.volume = 2; // can't reinitialize
}
}
