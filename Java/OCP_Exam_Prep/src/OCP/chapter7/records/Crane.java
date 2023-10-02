/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter7.records;

/**
 *
 * @author desmo
 */
public record Crane (int eggsNum, String name) {
    public static void main(String[] args){
        Crane mother = new Crane(4, "Carla");
        System.out.println(mother);
        System.out.println(mother.eggsNum);
    }
}
