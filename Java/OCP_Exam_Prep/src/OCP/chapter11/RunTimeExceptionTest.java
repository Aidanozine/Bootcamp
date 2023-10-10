/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter11;

/**
 *
 * @author desmo
 */
public class RunTimeExceptionTest {

    public static void main(String[] args) {
//        int[] countsOfMoose = new int[3];
//        System.out.println(countsOfMoose[-1]);
//--------------------------------------------------------
//        String type = "moose";
//        Object obj = type;
//        Integer number = (Integer) obj; // ClassCastException
//--------------------------------------------------------
        new Frog().hop(null, 1);
    }
}

class Frog {

    public void hop(String name, Integer jump) {
        System.out.print(name.toLowerCase() + " " + jump.intValue());
    }
}
