/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter7.records;

/**
 *
 * @author desmo
 */
public class RecordTest {
     public static void main(String[] args){
         Crane grandMother = new Crane(4, "Nessa");
        Crane mother = new Crane(4, "Carla");
        System.out.println(mother);
        System.out.println(mother.eggsNum);
        System.out.println(grandMother);
        System.out.println(grandMother.eggsNum);
        System.out.println(mother.equals(grandMother));
    }
     
    record Crane (int eggsNum, String name){} //must be in same class
}
