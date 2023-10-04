/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter9.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author desmo
 */
public class MissingDuck implements Comparable<MissingDuck> {

    private String name;
    
    public MissingDuck(String name){
        this.name = name;
    }

    public int compareTo(MissingDuck miaDuck) {
        if (miaDuck == null) {
            throw new IllegalArgumentException("This duck can't swim!");
        }
        if (this.name == null) {
            return 0;
        } else if (this.name == null) {
            return -1;
        } else if (miaDuck.name == null) {
            return 1;
        } else {
            return name.compareTo(miaDuck.name);
        }
    }
    
    public String toString(){
        return name;
    }
    
    public static void main(String[] args) {
        List<MissingDuck> ducks = new ArrayList<>();
        ducks.add(new MissingDuck("Webber"));
        ducks.add(new MissingDuck("Beck"));
        Collections.sort(ducks);
        System.out.println(ducks);
    }
}
